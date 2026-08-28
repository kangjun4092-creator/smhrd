-- 26.06.30


-- 01.select 절

-- 주석 기호 : 한문장씩 사용할 수 있는 주석 기호

-- 글자 크기 키우기 : 도구 > 환경설정 > 코드편집기 > 글꼴
-- 주석 색깔 바꾸기 : 도구 > 환경설정 > 코드편집기 > PL/SQL 주석 > 전경색

/*
여러 문장을
한번에
작성할 수 있는 주석 기호    
*/

-- >>엔터티(entity) : 테이블(table) 
    -- 업무에 필요하고 유용한 정보를 저장하고 관리하기 위한 "데이터의 집합"
    -- hr 의 entity : COUNTRIES , DEPARTMENTS , EMPLOYEES , JOBS  ......

-- >>속성(Attribute) : 컬럼(column)
    -- 엔터티가 가지는 특성을 말하며 엔터티를 설명하는 역할을 한다.
    -- ht.employees 테이블의 컬럼 : EMPLOYEE_ID , FIRST_NAME , LAST_NAME .....

-- >>인스턴스(instance) : 열(row)
    -- 엔터티가 값을 가져서 실체화가 된 것, 즉 속성이 가지는 하나의 값 = 실제 데이터 값'

-- desc(describe) : 해당테이블의 구조를 확인하는 명령
desc employees ;

-- 부서테이블(departments) 테이블의 구조를 확인해보자.
desc departments ;

-- [select 절 사용 방법]
-- select   : 조회하고자 하는 "컬럼의 정보"
-- from     : 컬럼의 정보를 가져올 "테이블의 정보"

-- employees (직원들의 정보가 들어있는 테이블)에서 직원id, 직원이름, 이메일 정보를 조회

select employee_id, first_name, last_name, email, phone_number from employees ;

SELECT EMPLOYEE_ID, FIRST_NAME
    FROM EMPLOYEES ;

/*
1. sql 문장에는 대소문자를 구분하지 않는다.
   > sql 문장은 소문자로 작성해도 되지만, DB에 저장되는 테이블과 컬럼의 정보는
     전부 대문자로 저장이 되어진다.
     그래서 sql 문장을 작성할때 대문자로 작성하는 것이 일반적이다.

2. sql 문장 끝에는 반드시 ;(세미콜론)을 작성해줘야 한다.
    > ;(세미콜론)은 데이터베이스 프로그래밍에서 문장의 끝을 의미하는 것
    
3. 띄어쓰기나 줄바꿈 또한 명령어 수행에 영향을 주지 않는다.

4. sql 실행 단축키 : ctrl + enter, F9

*/

-- 실습 1)  직원테이블에서 직원ID, 이름, 급여, 부서ID 정보를 조회하시오.

SELECT employee_id, first_name, last_name, salary, department_id
  FROM employees ;


-- 실습 2)  부서테이블에서 부서ID, 부서명, 위치ID 정보를 조회하시오.

select department_id, department_name, location_id
  from departments ;
 
-- 실습 3) 위치테이블에서 위치ID, CITY 컬럼의 정보를 조회하시오.

select location_id, city
  from locations ;

-- 실습 4 ) 직무테이블에서 직무ID, 직무이름의 정보를 조회하시오.

select job_id, job_title
  from jobs ;
  
--SELECT 절 활용)
  -- 1. 전체 조회하기
    -- : SELECT 절에 *(아스타리스크) 키워드를 사용하면 된다.
    -- : 프로그래밍에서 아스타리스크란 다양한 의미를 가지는 특수 문자이다.
    -- : select 절에 *(아스타리스크)는 단독으로만 사용이 가능하다.

-- sql해석 : 직원테이블의 모든 컬럼의 정보를 조회 한 것.

select * from employees ;



-- 실습 1) 나라 테이블의 모든 정보를 조회

select * from countries ;

-- 실습 2) 부서테이블의 모든 정보를 조회

select * from departments ;

  -- 2. 중복을 제거하여 출력하기.
    -- : select 절에 DISTINCT 라는 옵션을 사용하면 된다. (ALL 은 기본값)
-- sql 해석 : 직원테이블에서 부서ID 컬럼의 정보를 조회.
select distinct department_id
  from employees ;
  
-- SELECT 절 기본 사용 방법
-- SELECT (ALL / DISTINCT) 조회하고자 하는 "컬럼의 정보"
-- FROM 컬럼의 정보를 가져올 "테이블의 정보"


  -- 3. 컬럼에 별침 적용하기
    --1) SELECT 컬럼명 AS 별칭명
    --2) SELECT 컬럼명 AS "별칭명"
    --3) SELECT 컬럼명 별칭명
    --4) SELECT 컬럼명 "별칭명"
      --> 별칭에 "" 감싸는 이유 : 별칭에 특수문자를 적용시킬 때 사용 (공백도 특수문자)
    
-- SQL해석 : 직원테이블에서 직원ID, 직원이름, 이메일, 급여 정보를 조회 (AS : 별칭)
SELECT EMPLOYEE_ID AS "직원 아이디", FIRST_NAME, EMAIL, SALARY
  FROM EMPLOYEES ;
  
  
  -- 4. 컬럼에 산술연산 적용하기.
    -- 컬럼의 자료형이 숫자형, 날짜형 일 경우 산술연산(*,/,+,-) 이 가능하다.
    
desc employees ;

-- sql해석 : 직원테이블에서 직원id, 이름, 급여의 정보를 조회
select employee_id
  , employee_id + 1000 AS "emp+1000"
  , first_name
  , salary
  , salary * 12 AS "SL*12"
  from employees ;
  
-- 실습 1) 직원테이블에서 직원ID, 이름, 급여, 이메일, 입사날짜 정보를 조회하시오.
  -- 입사날짜 정보는 H+H 라는 별칭을 적용하여 출력하시오.
  
select employee_id, first_name, last_name, salary, email, hire_date as "H+H"
  from employees;
  
-- 실습 2) 직원테이블에서 이름, 급여, 연봉 데이터를 출력하시오.
  -- 연봉데이터는 S+12 라는 별칭을 적용하여 출력하시오.
  
-- 정석 SQL 문장  
select first_name
      , last_name
      , salary
      , salary * 12 as "S+12"
  from employees ;






-- 26.07.01

-- ORDER BY 절 : 특정 컬럼을 기준으로 정렬화
--> SQL 문장에서 가장 마지막에 작성되고 가장 마지막에 실행이 된다.
--> 별도로 정렬 방식을 지정하지 않으면 기본값이 ASC(오름차순) 정렬이 적용된다.

--[ORDER BY 절의 정렬 방식]
-- ASC (Ascending) : 오름차순 정렬 (1,2,3,4,5 .....)
-- DESC (Descending) : 내림차순 정렬 (10,9,8,7,6 .... )

--[ORDER BY 절 사용 방법]
-- SELECT 조회하고자 하는 "컬럼의 정보"
-- FROM   컬럼의 정보를 가져올 "테이블의 정보"
-- ORDER BY [특정컬럼] [정렬방식] ;

-- DB에서 읽는 순서 FROM -> SELECT -> ORDER BY

-- 직원테이블에서 모든 직원의 정보를 조회하시오.
-- 단 직원ID 기준으로 높은 값부터 출력되게 하시오.
SELECT *
  FROM employees
ORDER BY employee_id DESC ;

-- 실습 1) 직원테이블에서 직원ID, 급여, 부서ID, 급여외추가수당, 입사날짜 정보를 조회하시오.
-- 단 급여가 가장 높은 순서대로 정렬하여 출력하시오.

SELECT employee_id
      ,salary
      ,department_id
      ,commission_pct
      ,hire_date
  FROM employees
ORDER BY salary DESC ;


-- 실습 2) 직원테이블에서 직원ID, 이름, 입사날짜, 이메일 정보를 조회하시오.
-- 단 최근에 입사한 날짜를 기준으로 정렬하여 출력하시오.

SELECT employee_id  
      ,first_name
      ,last_name
      ,hire_date
      ,email
  FROM employees
ORDER BY hire_date DESC ;