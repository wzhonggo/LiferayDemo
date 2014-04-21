create table labimo_LiferayTincanManifestAct (
	id_ LONG not null primary key,
	activityId VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	launch VARCHAR(75) null
);

create table labimo_LiferayUser (
	id_ LONG not null primary key IDENTITY,
	liferayUserId LONG,
	name VARCHAR(75) null,
	preferredAudioLevel DOUBLE,
	preferredLanguage VARCHAR(75) null,
	preferredDeliverySpeed DOUBLE,
	preferredAudioCaptioning LONG
);

create table labimo_Oauth2Client (
	id_ VARCHAR(75) not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	secret VARCHAR(75) null,
	url VARCHAR(75) null,
	redirectUrl VARCHAR(75) null,
	scope VARCHAR(75) null,
	iconUrl VARCHAR(75) null,
	liferayUserId LONG
);

create table labimo_Oauth2Endpoint (
	id_ LONG not null primary key,
	liferayUserId LONG,
	oauthType VARCHAR(75) null,
	isPublic BOOLEAN,
	guestAccess BOOLEAN
);

create table labimo_Oauth2Token (
	id_ LONG not null primary key,
	code_ VARCHAR(75) null,
	token VARCHAR(75) null,
	refreshToken VARCHAR(75) null,
	clientId LONG,
	expiredIn LONG,
	liferayUserId LONG
);

create table labimo_TincanActivityState (
	id_ LONG not null primary key,
	stateId VARCHAR(75) null,
	state_ VARCHAR(75) null,
	jsonState VARCHAR(75) null,
	agentId LONG,
	activityId LONG,
	registration VARCHAR(75) null,
	etag VARCHAR(75) null,
	updated DATE null,
	contentType VARCHAR(75) null
);

create table labimo_TincanAgent (
	id_ LONG not null primary key,
	objectType VARCHAR(75) null,
	name VARCHAR(75) null,
	mbox VARCHAR(75) null,
	mbox_sha1sum VARCHAR(75) null,
	openID VARCHAR(75) null,
	oauth_identifier VARCHAR(75) null,
	canonical_version BOOLEAN
);

create table labimo_TincanAgentProfile (
	id_ LONG not null primary key,
	profileId VARCHAR(75) null,
	updated DATE null,
	agentId LONG,
	profile VARCHAR(75) null,
	json_profile VARCHAR(75) null,
	content_type VARCHAR(75) null,
	etag VARCHAR(75) null
);

create table labimo_TincanAttachment (
	id_ LONG not null primary key,
	usageType VARCHAR(75) null,
	contentType VARCHAR(75) null,
	length LONG,
	sha2 LONG,
	fileUrl VARCHAR(75) null,
	payload VARCHAR(75) null,
	display VARCHAR(75) null,
	description VARCHAR(75) null
);

create table labimo_TincanStatement (
	id_ LONG not null primary key,
	statementId VARCHAR(75) null,
	subStatementId LONG,
	agentId LONG,
	contextId LONG,
	activityId LONG,
	resultId LONG,
	authorityId LONG,
	timestamp DATE null,
	stored DATE null,
	version VARCHAR(75) null,
	verbId LONG,
	voided BOOLEAN
);

create table labimo_TincanStatementAttachment (
	id_ LONG not null primary key,
	statementId LONG,
	statementAttachmentId LONG
);

create table labimo_TincanStatementContext (
	id_ LONG not null primary key,
	registration VARCHAR(75) null,
	instructorId LONG,
	teamId LONG,
	contextActivitiesId LONG,
	revision VARCHAR(75) null,
	platform VARCHAR(75) null,
	language VARCHAR(75) null,
	statement VARCHAR(75) null,
	extensions VARCHAR(75) null
);

create table labimo_TincanStatementResult (
	id_ LONG not null primary key,
	success BOOLEAN,
	completion BOOLEAN,
	response VARCHAR(75) null,
	duration VARCHAR(75) null,
	extension VARCHAR(75) null,
	scoreScaled DOUBLE,
	scoreRaw DOUBLE,
	scoreMin DOUBLE,
	scoreMax DOUBLE
);

create table labimo_TincanSubStatement (
	id_ LONG not null primary key,
	agentId LONG,
	activityId LONG,
	resultId LONG,
	contextId LONG,
	verbId LONG,
	timestamp DATE null
);

create table labimo_TincanVerb (
	id_ LONG not null primary key,
	verbId VARCHAR(75) null,
	display VARCHAR(75) null
);