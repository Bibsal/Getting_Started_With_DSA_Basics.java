    -- CREATE TABLE  employee(
    -- unique and Not Null
--     EmpCode INT(4) ,
--     EmpFName VARCHAR(40) NOT NULL,
--     EmpLName VARCHAR(40) ,
--     JOB VARCHAR(50) NOT NULL,
--     -- correct char to int 
--      ManagerCode  CHAR(4),
--      HireDate    DATE NOT NULL,
-- --    salary dataype add 
--    Salary       INT(10) NOT NULL,
--    Commission   INT(10),
--    DEPTCODE     INT(3) NOT NULL
-- --    email
-- );
CREATE TABLE employee (                    
    EmpCode Int(4) ,
    EmpFName VARCHAR(40) NOT NULL,
    EmpLName VARCHAR(40) ,
    JOB VARCHAR(50) NOT NULL,
    ManagerCode CHAR(4),  -- change this datatype from char to int using the alter command
    HireDate DATE NOT NULL,
    Salary INT(10) NOT NULL,
    Commission INT(10),
    DeptCode INT(3) NOT NULL
);

-- Till here our table will be created with the above mentioned columns/attributes
---------------------------------------------------------------------------
-- Now we will add one more column named email, but since we have already created our table so how can we add a new column in the same table
-- So yes we can add a new column in the existing table using the ALTER command.
-- ALTER command is used for adding removing modifying in a table , basically altering in a table.

ALTER TABLE employee ADD COLUMN email VARCHAR(40) NOT NULL;