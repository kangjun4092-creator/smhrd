-- 05. JOIN 활용

/* 조인이란?
  두 개 이상의 테이블을 연결하여 관련이 있는 테이블을
  하나의 결과 값으로 조회할 수 있게 해주는 기술 이다.
  즉 서로 다른 테이블에 나뉘어 저장된 관련 데이터를 연결하여 한번의 결과로 확인하는 작업
*/

-- EMPLOYEE_ID, FIRST_NAME, SALARY, DEPARTMENT_ID, DEPARTMENT_NAME 컬럼의 정보를 조회하시오.

-- CROSS JOIN
SELECT EMPLOYEES.EMPLOYEE_ID
      , EMPLOYEES.FIRST_NAME
      , EMPLOYEES.DEPARTMENT_ID
      , DEPARTMENTS.DEPARTMENT_NAME
  FROM EMPLOYEES, DEPARTMENTS ;
  
  
-- 조인 조건이 없는 조인을 CROSS JOIN 이라고 한다.
-- CROSS JOIN을 "카티션 곱" 이라고도 표현한다.
--> 카티션 곱 : 모든 경우의 수가 나오는 경우를 말한다.


-- 등가 조인
  
-- 등가조인 : 두 개 이상의 테이블에서 조건이 일치하는 행만 반환해주는 조인 기술
-- SELECT  테이블A.컬럼명, 테이블B.컬럼명 --> 해당 테이블에 있는 컬럼을 .(경로)와 함께 작성
-- FROM    테이블A, 테이블B --> 조인하겠다.
-- WHERE   테이블A.컬럼명 = 테이블B.컬럼명 --> 해당 조건으로 조인을 수행하겠다.<조인조건>

SELECT EMPLOYEES.EMPLOYEE_ID
      , EMPLOYEES.FIRST_NAME
      , EMPLOYEES.DEPARTMENT_ID
      , DEPARTMENTS.DEPARTMENT_NAME
  FROM EMPLOYEES, DEPARTMENTS
  WHERE EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID 
  ORDER BY EMPLOYEE_ID ASC;
  
  
-- EMPLOYEE_ID, FIRST_NAME, JOB_ID, JOB_TITLE 컬럼의 정보를 순서대로 출력하시오.
-- 조인할 테이블의 정보 : EMPLOYEES, JOBS

SELECT EMPLOYEES.EMPLOYEE_ID
      , EMPLOYEES.FIRST_NAME
      , EMPLOYEES.JOB_ID
      , JOBS.JOB_TITLE
  FROM EMPLOYEES, JOBS
  WHERE EMPLOYEES.JOB_ID = JOBS.JOB_ID 
  ORDER BY EMPLOYEES.EMPLOYEE_ID ASC ;


/*
  [ 조인 프로세스 ] 
  1. 조인할 대상 테이블의 정보를 확인 --> 관계형 DB확인
  2. FROM 절에 조인할 테이블을 ,(컴마) 기준으로 작성
  *3. WHERE 절에 조인 조건이 되는 특정 컬럼을 확인하여, "조인 조건절"을 작성
  > 조인 조건이 되는 특정 컬럼 : 조인 할 테이블 간 같은 결과 값을 가지는 컬럼
  > 주로 PK - FK 관계로 조인이 이루어진다. 다만 다 그런것은 아님.
  4. SELECT 절에 출력하고자 하는 컬럼명을 .(경로) 와 함께 작성
*/


-- DEPARTMENT_ID, DEPARTMENT_NAME. LOCATION_ID, CITY 컬럼의 정보를 순서대로 출력하시오.
-- 조인할 테이블의 정보 : DEPARTMENTS, LOCATIONS

SELECT DEPARTMENTS.DEPARTMENT_ID
      ,DEPARTMENTS.DEPARTMENT_NAME
      ,DEPARTMENTS.LOCATION_ID
      ,LOCATIONS.CITY
  FROM DEPARTMENTS, LOCATIONS 
  WHERE DEPARTMENTS.LOCATION_ID = LOCATIONS.LOCATION_ID 
  ORDER BY DEPARTMENT_ID ASC;
  
  
/*
  [ 테이블에 별칭 적용 ]
  > 테이블에 별칭 사용시 AS 키워드는 사용 불가능
  > 테이블에 별칭 사용시 이후에 실행되는 모든 절에는 반드시 별칭으로 사용해야 한다.
*/

SELECT D.DEPARTMENT_ID
      ,D.DEPARTMENT_NAME
      ,D.LOCATION_ID
      ,L.CITY
  FROM DEPARTMENTS D, LOCATIONS L
  WHERE D.LOCATION_ID = L.LOCATION_ID ;
  
-- 조인시 단독으로 존재하는 컬럼은 .(경로)를 안적어줘도 코드에 영향을 주지 않는다.
--> 다만 코드의 가독성을 위해서 해당 테이벌의 경로를 적어주는 것이 일반적이다.


-- EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, DEPARTMENT_NAME, EMAIL 컬럼의 정보 조회
-- 단 직원ID가 100, 103에 해당되는 직원에 정보만 조회하시오.
-- 조인할 테이블의 정보 : EMPLOYEES , DEPARTMENTS

SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,E.DEPARTMENT_ID
      ,D.DEPARTMENT_NAME
      ,E.EMAIL
  FROM EMPLOYEES E, DEPARTMENTS D
  WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
  AND E.EMPLOYEE_ID IN (100, 103) ; 
  
/*
  ANSI 조인문법 : INNER JOIN (내부조인)
  > 모든 DBMS에서 사용 가능한 조인 기법
  > INNER 는 생략이 가능함.
*/

SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,E.DEPARTMENT_ID
      ,D.DEPARTMENT_NAME
      ,E.EMAIL
  FROM EMPLOYEES E
  INNER JOIN DEPARTMENTS D
  ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
  WHERE E.EMPLOYEE_ID IN (100,103);
  
-- EMPLOYEE_ID, FIRST_NAME, JOB_ID, JOB_TITLE 컬럼의 정보를 조회하시오.
-- 단 JOB_ID 가 AD_PRES, AD_VP, IT_PROG 에 해당하는 직원에 대한 정보만 조회하시오.

-- 오라클 조인 문법 : 등가조인(EQUI)
SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,E.JOB_ID
      ,J.JOB_TITLE
  FROM EMPLOYEES E, JOBS J
  WHERE E.JOB_ID = J.JOB_ID
  AND E.JOB_ID IN ('AD_PRES', 'AD_VP' , 'IT_PROG') ;
  

-- ANSI 조인문법 : INNER조인 (내부조인)

SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,E.JOB_ID
      ,J.JOB_TITLE
  FROM EMPLOYEES E
  INNER JOIN JOBS J
  ON E.JOB_ID = J.JOB_ID
  WHERE E.JOB_ID IN ('AD_PRES', 'AD_VP' , 'IT_PROG') ;
  
  
-- 3개 이상의 테이블 조인
-- EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_NAME, CITY 컬럼의 정보 조회
-- 조인할 테이블의 정보 : EMPLOYEES, DEPARTMENTS, LOCATIONS

-- 오라클 조인 문법 : EQUI 조인 (등가조인)
SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,D.DEPARTMENT_NAME
      ,L.CITY
  FROM EMPLOYEES E , DEPARTMENTS D, LOCATIONS L
  WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
  AND D.LOCATION_ID = L.LOCATION_ID ;
  
 -- ANSI 조인문법 : INNER조인 (내부조인)
 
SELECT E.EMPLOYEE_ID
      ,E.FIRST_NAME
      ,D.DEPARTMENT_NAME
      ,L.CITY
  FROM EMPLOYEES E 
  JOIN DEPARTMENTS D
  ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
  JOIN LOCATIONS L
  ON D.LOCATION_ID = L.LOCATION_ID ;
  