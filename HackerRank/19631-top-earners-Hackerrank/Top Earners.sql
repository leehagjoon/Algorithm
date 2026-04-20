SELECT salary * months, count(*)
FROM employee
where salary * months =
                    (SELECT max(salary*months)
                        FROM employee)
GROUP BY salary*months;
