create table license_License (
	licenseUuid VARCHAR(75) not null,
	hardwareUuid VARCHAR(75) not null,
	userId LONG,
	content TEXT null,
	createDate DATE null,
	modifiedDate DATE null,
	primary key (licenseUuid, hardwareUuid)
);