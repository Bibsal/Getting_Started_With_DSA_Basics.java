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