select *
from Cinema
where id%2!=0 and description!='boring'
order by rating desc;

-- select *
-- from Cinema
-- where description<>'boring' and mod(id,2)<>0
-- order by rating desc;