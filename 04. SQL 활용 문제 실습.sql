-- 04. SQL 활용 문제 실습

/*
정 리
가볍게 읽어보세요

-- [ WHERE 절 기본 사용방법 ]
-- 1. SELECT   조회할 '컬럼' 명1 ...
-- 2. FROM     조회할 '테이블' 명
-- 3. WHERE    조회할 행을 선별하기 위한 '조건식'

SQL에서 사용할수 있는 연산자들

1. 산술연산자 < +, -, *, / >

2. 비교연산자 
    >  : 크다 (초과)
    >= : 크거나 같다 (이상)
    <  : 작다
    <= : 작거나 같다 (이하)
    
3. 등가연산자 ( 같거나 같지않거나 )
    = : 같다
    != , <>, ^= : 같지 않다.
    NOT A = B   : 같지 않다.
    
4. 논리 연산자
    AND(그리고) : 조건을 모두 만족하는 경우 TRUE 
    OR  (혹은)  : 하나의 조건이라도 만족하는 경우 TRUE
    * AND >= OR  : 우선순위가 AND 연산자가 높아서 AND 연산자가 먼저 실행이 된다.
    
5. NULL 관련 연산자
    IS NULL  : 데이터 값이 NULL 인 값을 조회
    IS NOT NULL : 데이터 값이 NULL 이 아닌 값을 조회
    
*/

-- < 문제 > 


-- 문제 1) 직원테이블에서 보너스를 0.2를 받는 직원의 이름, 급여, 보너스 정보를 출력
SELECT FIRST_NAME, LAST_NAME, SALARY, COMMISSION_PCT
  FROM EMPLOYEES
  WHERE COMMISSION_PCT = 0.2; 
  -- WHERE COMMISSION_PCT IN 0.2 ;


-- 문제 2) 직원테이블에서 급여를 9000 이상 받는 직원의 이름,급여,부서ID 정보를 출력
SELECT FIRST_NAME, SALARY, DEPARTMENT_ID 
  FROM EMPLOYEES
  WHERE SALARY >= 9000 
  ORDER BY SALARY ASC;


-- 문제 3) 직원테이블에서 급여가 7000 이상이면서 JOB_ID가 'SA_REP'인 직원의 직원ID, 이름, 직책ID 정보 출력
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, JOB_ID, SALARY
  FROM EMPLOYEES
  WHERE SALARY >= 7000
  AND JOB_ID = 'SA_REP'
  ORDER BY EMPLOYEE_ID DESC ;


-- 문제 4) 직원 테이블에서 급여가 10000 대인 직원의 이름, 급여, 매니저ID, 부서ID 정보를 출력
SELECT FIRST_NAME, LAST_NAME, SALARY, MANAGER_ID, DEPARTMENT_ID
  FROM EMPLOYEES
  WHERE SALARY BETWEEN 10000 AND 19999; 
  -- WHERE SALARY >= 10000 AND SALARY < 20000;


-- 문제 5) JOB_ID가  IT_PROG와 FI_ACCOUNT가 아닌 직원의 이름, JOB_ID 를 출력
SELECT FIRST_NAME, LAST_NAME, JOB_ID
  FROM employees
  WHERE JOB_ID NOT IN ('IT_PROG','FI_ACCOUNT');
-- WHERE JON_ID != 'IT+PROG' AND JOB_ID != 'FI_ACCOUNT';


-- 문제 6) 직원테이블에서 부서ID가 90이고, 급여가 5000이상인 직원의 직원ID, 이름, 급여, 부서ID 출력
SELECT DEPARTMENT_ID, EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY
  FROM EMPLOYEES
  WHERE DEPARTMENT_ID = 90 AND SALARY >= 5000;

-- 문제 7) 부서가 50부서이고, 직책ID가 'ST_MAN'인 직원의 모든 정보출력
SELECT *
  FROM EMPLOYEES
  WHERE DEPARTMENT_ID = 50 AND JOB_ID = 'ST_MAN';
  
-- < 추가 문제 >
-- 급여가 10000 이상 15000 이하 인 직원 중 급여외추가수당이 책정되어 있는 직원의 모든 정보 조회.
-- 직책ID가 SA_REP인 직원은 제외시키고, 급여외추가수당이 낮은 순서대로 정렬하여 출력하시오.
SELECT *
  FROM employees
  WHERE SALARY BETWEEN 10000 AND 15000
  AND JOB_ID != 'SA_REP'
  AND COMMISSION_PCT IS NOT NULL
  ORDER BY COMMISSION_PCT ASC;

