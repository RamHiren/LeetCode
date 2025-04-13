-- SELECT
--   Person.firstName,
--   Person.lastName,
--   Address.city,
--   Address.state
-- FROM Person
-- LEFT JOIN Address ON Person.personId = Address.personId;

select Person.firstName,Person.lastName,Address.city,Address.state From Person
left join Address on Person.personId = Address.personId;
