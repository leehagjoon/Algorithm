SELECT 
    COUNTRY.Continent, 
    FLOOR(AVG(CITY.Population))
FROM CITY
INNER JOIN COUNTRY ON CITY.CountryCode = COUNTRY.Code
GROUP BY COUNTRY.Continent;

/*
도시의 인구수(CITY)와 대륙 이름(COUNTRY)이 서로 다른 테이블에 있으므로 JOIN을 사용

개별 도시가 아닌 '대륙별' 평균이 궁금하므로 GROUB BY를 사용

평균 AVG() 함수를 사용하고, 소수점 이하 버림을 위해 FLOOR()함수 사용
*/
