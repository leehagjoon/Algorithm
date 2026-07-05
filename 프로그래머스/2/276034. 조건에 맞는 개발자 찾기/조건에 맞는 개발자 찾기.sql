-- 코드를 작성해주세요

select d.id
    , d.email
    , d.first_name
    , d.last_name
from developers d
    join skillcodes s
        on d.skill_code & s.code
where s.name in ('Python', 'C#')
group by d.id, d.email, d.first_name, d.last_name
order by d.id asc