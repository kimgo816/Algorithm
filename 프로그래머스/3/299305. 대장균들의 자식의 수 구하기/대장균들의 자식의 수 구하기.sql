SELECT ID, IFNULL(CHILD_COUNT, 0) as CHILD_COUNT FROM ECOLI_DATA ee
LEFT JOIN
(SELECT PARENT_ID ,COUNT(*) as CHILD_COUNT FROM ECOLI_DATA GROUP BY PARENT_ID) as c
ON ee.ID = c.PARENT_ID;