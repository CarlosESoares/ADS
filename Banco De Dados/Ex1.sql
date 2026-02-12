--1No esquema Human Resources, criar uma view para listar todos os dados de funcionários e também o título de sua respectiva função. Apresente no resultado apenas os funcionários que ganham entre 5.000,00 e 7.000,00 e que sejam comissionados.

CREATE VIEW vFuncionarioSalario AS
SELECT 
    e.employee_id,
    e.first_name,
    e.last_name,
    e.email,
    e.phone_number,
    e.hire_date,
    j.job_title, -- Título da função
    e.salary,
    e.commission_pct
FROM 
    EMPLOYEES1 e
JOIN 
    jobs1 j ON e.job_id = j.job_id
WHERE 
    e.salary BETWEEN 5000 AND 7000
    AND e.commission_pct IS NOT NULL 
    AND e.commission_pct > 0;

--2 No esquema Human Resources, criar uma view para listar os nomes dos países e o nome da região em que se localizam.

create view PaizEregiao as 
select 
p.country_name,
r.region_name
from paizes p 
 join regiao r on 
p.REGION_ID = r.REGION_ID;
