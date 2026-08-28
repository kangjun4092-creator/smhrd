-- DDL : 데이터 정의어 (테이블과 같은 데이터 저장 구조를 생성, 수정, 삭제 명령)


-- CREATE : 저장 구조를 생성 명령
CREATE TABLE 직원(
  직원ID NUMBER(10),
  이름 VARCHAR2(100),
  휴대폰번호 VARCHAR2(100),
  입사일 DATE,
  급여 NUMBER(10) NOT NULL,
  부서번호 NUMBER(10)
);



-- ALTER : 저장 구조 수정 명령
ALTER TABLE 직원 ADD CONSTRAINT 직원_직원ID_PK PRIMARY KEY(직원ID);

ALTER TABLE 직원 ADD CONSTRAINT 직원_번호_UK UNIQUE(휴대폰번호);

ALTER TABLE 직원 ADD CONSTRAINT 직원_부서_FK FOREIGN KEY(부서번호)
REFERENCES 부서(부서ID);



-- DEPARTMENTS 테이블을 한글버전으로 만들어주세요!
CREATE TABLE 부서(
  부서ID NUMBER(10),
  부서이름 VARCHAR2(100),
  관리자ID NUMBER(10),
  위치ID NUMBER(10)
);

ALTER TABLE 부서 ADD CONSTRAINT 부서_부서ID_PK PRIMARY KEY(부서ID);

-- 위치ID는 0보다 커야합니다
ALTER TABLE 부서 ADD CONSTRAINT 부서_위치_CK CHECK(위치ID>0);




-- DROP : 저장 구조를 삭제
DROP TABLE 직원;

/*
무결설 제약 조건

PK 대체 무결성 제약조건 : 기본키를 구성하는 속성은 NULL 값을 가질 수 없음
FK 참조 무결성 제약조건 : 외래키는 참조할 수 없는 값을 지닐 수 없음
*/




-- 실습1-1)

CREATE TABLE 네이버회원(
  회원ID VARCHAR2(15),
  이름 VARCHAR2(12) NOT NULL,
  비밀번호 VARCHAR2(16),
  생년월일 DATE,
  성별 VARCHAR2(3)
);

-- 실습1-2)
CREATE TABLE 네이버블로그(
  블로그번호 NUMBER PRIMARY KEY,
  블로그제목 VARCHAR2(100) NOT NULL,
  블로그내용 VARCHAR2(4000),
  블로그ID VARCHAR2(15),
  CONSTRAINT 블로그_회원ID_FK FOREIGN KEY(블로그ID) REFERENCES 네이버회원(회원ID)
);

-- 실습1-3)
ALTER TABLE 네이버회원 ADD CONSTRAINT 회원_ID_PK PRIMARY KEY(회원ID);

ALTER TABLE 네이버회원 ADD CONSTRAINT 회원_성별_CK CHECK(성별 IN ('남','여'));
/*
ALTER TABLE 네이버 회원 ADD CONSTRAINT 회원_성별_CK CHECK(성별 = '남' OR 성별 = '여')
*/

ALTER TABLE 네이버블로그 ADD CONSTRAINT 블로그_번호_PK PRIMARY KEY(블로그번호);

ALTER TABLE 네이버블로그 ADD CONSTRAINT 블로그_회원ID_FK FOREIGN KEY(블로그ID)
REFERENCES 네이버회원(회원ID);

DROP TABLE 네이버블로그;
DROP TABLE 네이버회원;





-- DML : 데이터 조작어 (테이블에 데이터를 삽입/수정/삭제 명령)
-- INSERT INTO 테이블명 VALUES(삽입할 데이터);
INSERT INTO 네이버회원 VALUES('TEST01','승환','123','07/07/27','남');
INSERT INTO 네이버회원 VALUES('TEST02','연희','123',SYSDATE,'여');
INSERT INTO 네이버회원(회원ID,이름,성별) VALUES('TEST03','준용','남'); 

-- 팀원들의 정보를 네이버회원 테이블에 넣어주세요

INSERT INTO 네이버회원 VALUES('TEST04','강준','123','89/10/03','남');
INSERT INTO 네이버회원 VALUES('TEST05','오용준','123',SYSDATE,'남');


-- UPDATE 테이블명 SET 컬럼명=바꿀데이터
UPDATE 네이버회원 SET 이름='짜장';
UPDATE 네이버회원 SET 이름='냉면' WHERE 회원ID='TEST01';

UPDATE 네이버회원 SET 이름='연희' WHERE 회원ID='TEST02';

UPDATE 네이버회원 SET 비밀번호='789', 생년월일='00/07/27' WHERE 회원ID='TEST03';

-- DELETE FROM 테이블명;
DELETE FROM 네이버회원 WHERE 회원ID='TEST05';

SELECT * FROM 네이버회원;

DELETE FROM 네이버회원;    -- 복구가능
DROP TABLE 네이버회원;     -- 복구불가능


-- TCL : 트랜잭션 제어어 
-- COMMIT : 수행한 트랜잭션을 데이터베이스에 영구반영
-- ROLLBACK : 트랜잭션에 수행했던 명령어 취소 (마지막 COMMIT 시점)


INSERT INTO 네이버회원 VALUES('TEST05','승환','123',SYSDATE,'남');

DELETE FROM 네이버회원;

COMMIT;
ROLLBACK;

/*
트랜잭션 4가지 특성

원자성(Automicity) : 모두 실행되거나 전혀 실행되지 않거나
일관성(Consistency) : 언제나 일관성 있는 상태로 유지하는 것
고립성(Isolation) : 트랜잭션 실행시 다른 트랜잭션의 영향을 받지 않는 것
지속성(Durability) : 성공적으로 완료된 트랜잭션은 오류가 발생하더라도 영구적 반영되어 보존되는 특성
*/


-- DCL : 데이터 제어어 ( GRANT : 권한부여, REVOKE : 권한회수, ROLE : 권한묶음 )
-- 권한 부여 : GRANT 권한명 TO 계정명;
-- 권한 회수 : REVOKE 권한명 FROM 계정명;

-- Run SQL Command Line 창에서 실행
-- CONN SYSTEM/12345;   <--  1.관리자 접속
-- CREATE USER DCLTEST IDENTIFIED BY 1234;   <-  2.계정 생성
-- GRANT CREATE SESSION TO DCLTEST;   <--  3.권한부여
-- GRANT CREATE TABLE TO DCLTEST;   <--  4.테이블 생성권한
-- GRANT UNLIMITED TABLESPACE TO DCLTEST;   <--  5.저장공간에 따른 권한 

-- REVOKE CREATE SESSION FROM DCLTEST;  <--  권한회수
-- REVOKE CREATE TABLE FROM DCLTEST;     <--  테이블 생성권한 회수
-- REVOKE UNLIMITED TABLESPACE FROM DCLTEST;    <-- 저장공간에 따른 권한 회수

-- ROLE 
-- GRANT RESOURCE TO DCLTEST;  <-- 몇가지가 묶인 권한 

