insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('employee1', true,'Test123', 'ROLE_EMPLOYEE');

insert into Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
values ('manager1', true,'Test123', 'ROLE_MANAGER');

----------------
insert into items (CODE, NAME, PRICE, CREATE_DATE)
values ('S001', 'Core Java', 100, current_timestamp);

insert into items (CODE, NAME, PRICE, CREATE_DATE)
values ('S002', 'Spring for Beginners', 50, current_timestamp);

insert into items (CODE, NAME, PRICE, CREATE_DATE)
values ('S003', 'Swift for Beginners', 120, current_timestamp);

insert into items (CODE, NAME, PRICE, CREATE_DATE)
values ('S004', 'Oracle XML Parser', 120, current_timestamp);

insert into items (CODE, NAME, PRICE, CREATE_DATE)
values ('S005', 'CSharp Tutorial for Beginers', 110, current_timestamp);