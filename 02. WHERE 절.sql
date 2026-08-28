-- 02. WHERE 절

-- [ WHERE 절 사용하는 방법 ]
-- SELECT   : 조회하고자 하는 "컬럼의 정보"
-- FROM     : 데이터를 가져올 "테이블의 정보"
-- WHERE    : 원하는 행(데이터)를 선별하기 위한 "조건 식"
-- ORDER BY : [특정컬럼][정렬방식]

-- 직원ID가 105에 해당하는 직원의 모든 정보를 조회하시오.
-- 조건 : employee_id 가 105와 같은 것

SELECT *
  FROM employees 
  WHERE employee_id = 105 ;
  
/*
  [ 비교 연산자 ]
  =  : 같다
  >  : 보다 크다 (초과)
  >= : 보다 크거나 같다 (이상)
  <  : 보다 작다 (미만)
  <= : 보다 작거나 같다 (이하)
*/

-- 실습 1) 급여가 7000을 받고 있는 직원의 이름, 직원ID, 부서ID, 급여 정보를 조회하시오.
-- 단 급여를 월_급여 라는 별칭을 적용하여 출력하시오.
-- 조건(WHERE) : salary 가 7000과 같은 것


SELECT first_name
      ,last_name
      ,employee_id
      ,department_id
      ,salary AS "월_급여"
  FROM employees 
  WHERE salary = 7000 ;
  
-- 기본값 특수 문자 : _  #
  

-- 실습 2) 급여를 7000 이하로 받고 있는 직원의 수는 몇명인가 작성하시오.
-- 정답 : 63

SELECT *
  FROM employees
  WHERE salary <= 7000 
  ORDER BY salary DESC;


-- 실습 3) 부서ID가 90에 해당하는 부서 이름을 작성하시오.
-- 정답 : Executive

SELECT department_name
      ,department_id
  FROM departments
  WHERE department_id = 90 ;
  

/*
  [ 부정 비교 연산자 ]
  != , <> , ^= : 같지 않다
  NOT A = B    : 같지 않다 
*/

/*
  [ 자료형 종류 ]
  ㅁ 문자형 자료형 : CHAR, VARCHAR 
  ( '' 작은 따옴표를 감싸줘야만 문자로 인식을 할 수 있다. )
  - "" 큰 따옴표는 별칭에 이미 사용중이라서 인식안됨
  
  ㅁ 숫자형 자료형 : NUMBER
  ( 숫자형 자료형은 그냥 숫자만 작성하면 된다. )
  
  ㅁ 날짜형 자료형 : DATE
  ( 날짜형 자료형도 '' 작은 따옴표를 감싸줘야만 문자형 자료형으로 인식을 할 수 있다. )
*/

SELECT 12345
      , 'ABCD'
      , 'abcd'
  FROM dual ;
  
/*
  [ 논리 연산자 ] TRUE or FALSE
  : 조건과 조건을 이어주는 역할을 한다.
  
  AND : 조건 모두 만족해야만 TRUE 값을 반환해주는 연산자.
  OR  : 하나의 조건이라도 만족하는 경우 TRUE 값을 반환해주는 연산자.
*/

-- 부서ID가 50,60,90에 해당하는 직원의 이름, 부서ID, 급여 정보를 조회하시오.

SELECT first_name
      ,last_name
      ,department_id
      ,salary
  FROM employees
  WHERE department_id = 50 
    OR department_id = 60
    OR department_id = 90 ;
    

-- 부서ID가 50이면서 급여가 7000 이상인 직원의 이름,부서ID,급여정보를 조회하시오.

SELECT first_name
      ,last_name
      ,department_id
      ,salary
  FROM employees
  WHERE department_id = 50 AND salary >= 7000 ;
  
-- 실습 1) 직책ID 가 AD_PRES에 해당하는 직책TITLE의 정보를 작성하시오.
-- 정답 : president

SELECT job_id
      ,job_title
  FROM jobs
  WHERE job_id = 'AD_PRES' ;

-- 실습 2) 직책ID가 IT_PROG에 해당하는 직원의 이름, 급여, 직책ID 정보를 조회하시오.
-- 직책ID를 직책정보라는 별칭으로 적용하고 급여 기준 내림차순 정렬하시오.

SELECT first_name
      ,last_name
      ,salary
      ,job_id AS "직책정보"
  FROM employees
  WHERE job_id = 'IT_PROG' ;
  ORDER BY salary DESC
  
-- 실습 3) 부서ID가 50에 해당하지 않는 부서이름만 조회하시오.

SELECT department_name
      ,department_id
  FROM departments
  WHERE department_id != 50;
  
-- 실습 4) 직책ID가 AD_PRES, AD_VP, IT_PROG에 해당하는 직원의 모든 정보를 조회하시오.

SELECT *
  FROM employees
  WHERE job_id = 'AD_PRES'
  OR job_id = 'AD_VP'
  OR job_id = 'IT_PROG' ;
  
-- 실습 5) 부서ID가 50에 소속되어 있으면서 급여는 5000 이하로 책정되어 있는 직원의 모든 정보를 조회하시오.

SELECT *
  FROM employees
  WHERE department_id = 50 AND salary <= 5000 
  ORDER BY salary DESC ;
  
/*
  NULL 값이란?
    - 존재하지 않거나 정해지지 않은 것을 의미 한다.
    - 데이터 값이 완전히 비어있는 상태를 말한다.
*/  
--  [ NULL의 특징 ]
--    1. NULL값은 산술연산이 적용되지 않는다.
--      예) 1000 + NULL = NULL
SELECT NULL
      , 1000
      , 1000 + 1000
      , 1000 + NULL
  FROM DUAL ;
  
--    2. NULL값은 비교연산이 적용되지 않는다.
--      : NULL값을 비교연산을 통해 구하면 FALSE값으로 인식을 해서 데이터 값이 조회가 안된다.
--      : NULL값을 조회하기 위해서는 IS NULL 연산자를 활용해야 한다.
SELECT FIRST_NAME, COMMISSION_PCT FROM EMPLOYEES
  WHERE COMMISSION_PCT = NULL ;
    
--    3. 숫자 0과 빈공백(" ")은 NULL값이 아니다. ( 데이터 값이 존재 )

/*
  [ IS NULL 연산자 ]
    IS NULL : 데이터 값이 NULL값을 조회하는 연산자.
      예) WHERE [컬럼명] IS NULL 
    IS NOT NULL : 데이터 값이 NULL이 아닌 값을 조회하는 연산자.
      예) WHERE [컬럼명] IS NOT NULL 
*/


-- 부서ID가 NULL인 직원의 이름, 급여, 이메일, 핸드폰번호 정보를 조회하시오.
-- 조건(WHERE) : DEPARTMENT_ID 가 NULL 과 같은 것

SELECT first_name
      ,last_name
      ,salary
      ,email
      ,phone_number
      ,department_id
  FROM employees
  WHERE department_id IS NULL ;
  
  
  
  
  
  
-- 7/2 ---------------------------------

-- SQL 연산자 활용하기

-- 부서ID가 79,80,90 에 해당하는 모든 직원의 정보를 조회하시오.

SELECT *
  FROM employees
  WHERE department_id = 70 
  OR department_id = 80
  OR department_id = 90 ;
  
-- [ IN , NOT IN연산자 ]

SELECT * FROM employees
  WHERE department_id IN (70, 80, 90) ;


SELECT * FROM employees
  WHERE department_id NOT IN (70, 80, 90) ;
  
  
-- 직원의 급여가 10000 이상 20000 이하의 범위의 값을 가진 직원의 모든 정보를 조회하시오.

SELECT * FROM employees
  WHERE salary >= 10000 AND salary <= 20000 ;
  
  
  
-- [ BETWEEN 연산자 : 범위연산자 ]
--  : A(최소값) 이상 B(최대값) 이하의 값을 가져오는 범위 연산자 이다.

SELECT * FROM employees
  WHERE salary BETWEEN 10000 AND 20000 ;
  


/*
  [ 연산자 우선 순위 ]
  AND > OR : AND 연산자가 OR 연산자보다 먼저 실행이 된다.
*/



-- 실습 1) 급여가 6000 이상 9000 이하인 직원 중에 급여외 추가수당이 없는 직원들의 모든 정보를 조회하시오.
-- 단, 급여 기준 오름차순 정렬하고 급여외 추가수당은 S_+! 이라는 별칭으로 적용하시오.

SELECT employee_id
      , first_name
      , last_name
      , email
      , phone_number
      , hire_date
      , job_id
      , salary
      , commission_pct AS "s_+!"
      , manager_id
      , department_id
  FROM employees
  WHERE salary BETWEEN 6000 AND 9000 
  AND commission_pct IS NULL
  ORDER BY salary ASC;
  


-- 실습 2) 직책ID가 IT_PROG, AD_PRES 인 직원 중에서
-- 급여가 8000 이상인 직원들의 직원ID, 이름, 급여, 직책ID, 부서ID 정보를 조회하시오.


SELECT employee_id
      ,first_name
      ,last_name
      ,salary
      ,job_id
      ,department_id
  FROM employees
  WHERE salary >= 8000 AND job_id IN ('IT_PROG', 'AD_PRES') ;