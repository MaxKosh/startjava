--querise database
SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'not destroyed';

SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'not destroyed';

DELETE FROM Jaegers WHERE status = 'destroyed';
