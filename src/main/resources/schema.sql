create table Personal(caseNo Integer not null,
borrowerType varchar(255),
name varchar(255),
dob varchar(255),
pan varchar(255),
primary key(pan)
);


create table ContactInfo(
address1 varchar(255),
address2 varchar(255),
country varchar(255),
state varchar(255),
city varchar(255),
email varchar(255),
pin Integer,
phoneNumber Integer,
pan varchar(255),
primary key(pan),
foreign key(pan)
);


create table CredHistory(credScore Integer not null,
credReport varchar(255),
pan varchar(255),
primary key(pan),
foreign key(pan)
);

create table EmpHistory(income Integer not null,
empStartDate Date,
empEndDate Date,
pan varchar(255),
primary key(pan),
foreign key(pan)
);

create table FinanceInfo(debts Integer not null,
assets varchar(255),
liabilities varchar(255),
pan varchar(255),
primary key(pan),
foreign key(pan)
);