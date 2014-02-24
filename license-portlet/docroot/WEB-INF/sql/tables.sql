create table labimo_Activation (
	activationId VARCHAR(75) not null primary key,
	hardwareUuid VARCHAR(75) null,
	licenseUuid VARCHAR(75) null,
	createTime DATE null,
	valid BOOLEAN
);

create table labimo_License (
	licenseUuid VARCHAR(75) not null primary key,
	userId LONG,
	issueDate DATE null,
	validDate DATE null,
	createDate DATE null,
	modifiedDate DATE null,
	productId LONG,
	valid BOOLEAN
);

create table labimo_Product (
	productId LONG not null primary key
);