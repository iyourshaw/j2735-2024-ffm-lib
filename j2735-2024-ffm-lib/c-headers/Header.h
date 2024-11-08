/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_Header_H_
#define	_Header_H_


#include "asn_application.h"

/* Including external dependencies */
#include "DYear.h"
#include "MinuteOfTheYear.h"
#include "DSecond.h"
#include "Common_MsgCount.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Header */
typedef struct Header {
	DYear_t	*year;	/* OPTIONAL */
	MinuteOfTheYear_t	*timeStamp;	/* OPTIONAL */
	DSecond_t	*secMark;	/* OPTIONAL */
	Common_MsgCount_t	*msgIssueRevision;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} Header_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_Header;
extern asn_SEQUENCE_specifics_t asn_SPC_Header_specs_1;
extern asn_TYPE_member_t asn_MBR_Header_1[4];

#ifdef __cplusplus
}
#endif

#endif	/* _Header_H_ */
#include "asn_internal.h"
