-- 03. SQL 문장 종류 및 활용

/*
   [ DDL, DML, DCL, TCL ]
  
  CHAPTER 1. DDL (Data Definition Language) : 데이터 정의어
  > 테이블 같은 데이터 구조를 정의하는 언어.
  > 특정 구조를 생성, 변경, 삭제, 이름을 바꾸는 명령어들로 구성이 되어짐
  
  [ DDL 명령어 종류 ]
  > CREATE : 테이블, USER(계정) 같은 객체를 '생성'하는 명령어
  > ALTER  : 테이블, USER(계정) 같은 객체를 '변경'하는 명령어
  > DROP   : 테이블, USER(계정) 같은 객체를 '삭제'하는 명령어
  > TRUNCATE : 테이블 안에 있는 데이터를 '영구 삭제'하는 명령어
  > RENAME : 테이블의 '이름을 변경'하는 명령어

  [ 계정 생성하는 방법 ]
  > CREATE USER [계정이름] IDENTIFIED BY [비밀번호] ;
  : 계정을 생성할때는 SYSTEM(오라클최고 관리자 계정)에 접속해서 생성한다.

  DDL 목표
  > AI_SOFT 라는 새로운 계정을 만들어서 scott 계정에 관계형 DB를 구현해보자.
  1) 계정 만들기 : AI_SOFT
  2) 테이블 생성하기 : EMP, DEPT
  3) 관계형 DB 구축하기 (제약조건 설정하기) : PK, FK 개념 이해하기
*/

 
--  테이블의 구조를 확인하는 방법 2가지
--  1. DESC [테이블 명] ;

DESC EMP ;

-- 2. 해당 테이블명 을 선택(드래그) 후 SHIFT + F4 를 눌러준다.

CREATE TABLE EMP (
EMPNO NUMBER(4,0),
ENAME	VARCHAR2(10),
JOB	VARCHAR2(9),
MGR	NUMBER(4,0),
HIREDATE	DATE,
SAL	NUMBER(7,2),
COMM	NUMBER(7,2),
DEPTNO	NUMBER(2,0)
) ;

-- 테이블 조회하는 명령어
-- SELECT * FROM [테이블 명];

-- 테이블 삭제하는 명령어
-- DROP TABLE [테이블 명];

DESC DEPT ;

CREATE TABLE DEPT (
DEPTNO	NUMBER(2,0),
DNAME	VARCHAR2(14),
LOC	VARCHAR2(13)
) ;

SELECT * FROM dept ;

-- 제약조건 : Constraint
-- > 테이블에 저장되는 데이터의 정확성과 일관성을 보장하기 위해 설정하는 규칙
-- > 즉 잘못된 데이터가 들어오지 않도록 막아주는 안전장치이다.

/* 제약조건의 종류
 PRIMARY KEY(PK) : 기본키, 테이블에 반드시 하나는 있어야 하는 키이다.
 > NOT NULL + UNIQUE : NULL값 불가 + 중복 불가

 UNIQUE KEY(UK) : 유일키, NULL값 허용 가능 단 중복은 불가능

 NOT NULL : NULL값 불가능 -> 반드시 데이터가 포함이 되어야 할때 사용한다.

 CHECK : TRUE OR FALSE -> 조건을 걸어줘서 해당 조건에 맞는 데이터만  입력 가능하게 설정

 FOREIGN KEY(FK) : 외래키, 테이블과 테이블을 이어주는 KEY 이다.
*/

-- AI_SOFT.EMP 테이블에서 PK 제약조건 걸어주기

-- [ 제약조건 지정하는 방법 ]
-- ALTER TABLE [테이블명] ADD CONSTRAINT [제약조건 명(임의작성)] [제약조건(해당컬럼)] ;

ALTER TABLE EMP ADD CONSTRAINT AI_SOFT_EMP_EMPNO PRIMARY KEY(EMPNO) ;

-- AI_SOFT.DEPT 테이블의 PK 제약조건 지정하기
-- PK로 지정할 컬럼명 : DEPTNO
-- 제약조건 이름을 DEPT_DEPTNO_PK로 지정하여 주세요.

ALTER TABLE DEPT ADD CONSTRAINT DEPT_DEPTNO_PK PRIMARY KEY(DEPTNO) ;






-- 7/3







/*
  [ 테이블 생성시 사용하는 자료형 종류 ]
  > VARCHAR2(N) : 가변 길이 문자열 정보로서 N만큼 최대 길이를 갖는 문자형 자료형이다.
    : 예) VARCHAR2(10) -> ABC -> 3BYTE (10BYTE 초과 제한)
    
  > CHAR(N) : 고정 길이 문자열
    : 예) CHAR(10) -> ABC -> 10BYTE (3BYTE 여도 10BYTE로 저장됨 : ABC0000000)
    
  > NUMBER(P,S) : 정수, 실수 숫자 타입을 입력 받는 숫자형 자료형이다.
    : 숫자형 값을 P자리 만큼 입력 받고, S자리만큼 소수를 입력 받는다.
    : 예) NUMBER(3) -> 999, NUMBER(3,1) -> 99.9, NUMBER(4,3) -> 9.999
    단, 실무에서는 (p,s) 소괄호를 생략을 많이 한다.
    
  > DATE : SYSDATE(날짜형 함수)를 사용하여 현재 날짜 값을 받는 날짜형 자료형이다.
    : TIMESTAMP라는 자료형도 있고 이 자료형은 밀리초까지 지정이 가능한 자료형이다.
*/

-- 제약조건 삭제하는 방법
-- ALTER TABLE [테이블 명] DROP CONSTRAINT [제약조건 이름] ;

-- AI_SOFT.EMP 테이블에 PK 제약조건 삭제하기.
ALTER TABLE EMP DROP CONSTRAINT AI_SOFT_EMP_EMPNO ;

ALTER TABLE EMP ADD CONSTRAINT AI_SOFT_EMP_EMPNO PRIMARY KEY(EMPNO) ;

/*
  [ 관계형 데이터베이스를 구축하는 프로세스 ]
  
  1. 계정 생성하기 : AI_SOFT

  2. 테이블 생성: CREATE TABLE EMP (
                EMPNO NUMBER(4,0),
                ENAME	VARCHAR2(10),
                JOB	VARCHAR2(9),
                DEPTNO	NUMBER(2,0)
                ) ;
  3. 관계형 DB를 구축 : 제약조건 > PK, FK

*/

-- [ 테이블을 삭제하는 명령어 ]
-- DROP TABLE [테이블 명];

-- AI_SOFT.DEPT 테이블을 삭제해보자.
DROP TABLE DEPT ;

-- AI_SOFT.EMP 테이블을 삭제해보자.
DROP TABLE EMP ;

-- [ DDL 정리 ]
-- 1. 테이블 생성


-- 1-1. EMP 테이블 생성
CREATE TABLE EMP (
  EMPNO NUMBER(4,0),
  ENAME	VARCHAR2(10),
  JOB	VARCHAR2(9),
  MGR	NUMBER(4,0),
  HIREDATE	DATE,
  SAL	NUMBER(7,2),
  COMM	NUMBER(7,2),
  DEPTNO	NUMBER(2,0)
) ;

-- 1-2. DEPT 테이블을 생성.
CREATE TABLE DEPT (
  DEPTNO	NUMBER(2,0),
  DNAME	VARCHAR2(14),
  LOC	VARCHAR2(13)
) ;

SELECT * FROM EMP ;
SELECT * FROM DEPT ;

-- 2. 테이블에 제약조건 설정하기
-- > PK(기본키)는 반드시 하나는 설정해야 한다.

-- AI_SOFT.EMP 테이블에 PK 제약조건 설정하기.
-- EMP 테이블에 EMPNO 컬럼을 PK 제약조건으로 설정해 줄 것

ALTER TABLE EMP ADD CONSTRAINT EMP_EMPNO_PK PRIMARY KEY(EMPNO) ;

-- AI_SOFT.DEPT 테이블에 PK 제약조건 설정하기.
-- DEPT 테이블에 DEPTNO 컬럼을 PK 제약조건으로 설정해 줄 것

ALTER TABLE DEPT ADD CONSTRAINT DEPT_DEPTNO_PK PRIMARY KEY(DEPTNO) ;


-- [ FK 제약조건 지정하는 방법 ]
-- ALTER TABLE [테이블 명] ADD CONSTRAINT [제약조건 명] [FOREIGN KEY(해당 컬럼)]
-- REFERENCES [참조테이블 (부모) (참조컬럼명)]

--> *참조컬럼명은 반드시 PK 에 해당해야 한다!!

-- AI_SOFT.EMP 테이블에 FK 제약조건 설정하기.
-- EMP 테이블에 DEPTNO 컬럼을 FK 제약조건으로 설정해 줄 것.

ALTER TABLE EMP ADD CONSTRAINT EMP_DEPTNO_FK FOREIGN KEY (DEPTNO)  -- 자식
REFERENCES DEPT(DEPTNO) ;  -- 부모

-- [ 테이블 삭제 ]
-- DROP 테이블 삭제 
DROP TABLE DEPT CASCADE CONSTRAINT  ;
-- CASCADE CONSTRAINT : 해당 테이블의 제약조건을 무시하고 강제로 삭제하는 옵션.


-- EMP 테이블 삭제
DROP TABLE EMP CASCADE CONSTRAINT ;

-- 테이블 삭제 확인
SELECT * FROM EMP ;
SELECT * FROM DEPT ;

/*
  CHAPTER 2. DML (Data Manipulation Language) : 데이터 조작어
  데이터베이스에 있는 데이터를 수정, 삭제, 추가 할때 사용하는 명령어
  
  [ DML 명령어 종류 ]
  SELECT : 데이터 조회
  INSERT : 데이터 삽입(추가)
  UPDATE : 데이터 수정(갱신)
  DELETE : 데이터 삭제
*/

-- 테이블 생성 방법 1)
CREATE TABLE EMP (
    EMPNO NUMBER(4,0),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4,0),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7,2),
    DEPTNO NUMBER(2,0)
) ;

DROP TABLE EMP ;

-- 테이블 생성 방법 2) PK 바로 지정 ( 제약조건명은 임의로 지정됨 )
CREATE TABLE EMP (
    EMPNO NUMBER(4,0) PRIMARY KEY,
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4,0),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7,2),
    DEPTNO NUMBER(2,0)
) ;

DROP TABLE EMP ;

-- 테이블 생성 방법 3) CONSTRAINT [제약조건명] PRIMARY KEY [(컬럼명)]
CREATE TABLE EMP (
    EMPNO NUMBER(4,0),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4,0),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7,2),
    DEPTNO NUMBER(2,0),
    CONSTRAINT EMP_EMPNO_PK PRIMARY KEY(EMPNO)
) ;

SELECT * FROM EMP ;

-- EMP 테이블에 데이터 추가 하기 : 나의 정보
INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(0001, '강준', '대표', NULL, SYSDATE, 70000, 1000, 10);

--> INSERT INTO 에 작성한 컬럼 리스트와 VALUES에 작성한 실제 데이터 값은
--> 1:1 매핑이 되기 때문에 순서와 자료형(크기)에 맞춰서 작성 해줘야 한다.

SELECT * FROM EMP ;



-- 실습 1) SCOTT.EMP 테이블에서 EMPNO가 7369애 해당하는 직원의 정보를 조회하여,
-- AI_SOFT.EMP 테이블에 INSERT(추가) 해보기

SELECT * FROM EMP 
  WHERE EMPNO = 7369 ;
  
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
  VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20) ;
  
SELECT * FROM EMP ;

-- DELETE FROM EMP WHERE EMPNO = 7369 ; 포함된 행을 삭제 