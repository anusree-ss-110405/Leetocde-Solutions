select lastname,firstname,city,state
from Person 
left join Address
using(personId)

-- select a.firstName,a.lastName,b.city,b.state
-- from Person as a
-- left join Address as b
-- using(personId);