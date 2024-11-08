/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CooperativeControlMessage"
 * 	found in "asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CooperativeControlMessage_H_
#define	_CooperativeControlMessage_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BSMcoreData.h"
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct CCMpartIIExtension;

/* CooperativeControlMessage */
typedef struct CooperativeControlMessage {
	BSMcoreData_t	 coreData;
	struct CooperativeControlMessage__partII {
		A_SEQUENCE_OF(struct CCMpartIIExtension) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *partII;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CooperativeControlMessage_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CooperativeControlMessage;
extern asn_SEQUENCE_specifics_t asn_SPC_CooperativeControlMessage_specs_1;
extern asn_TYPE_member_t asn_MBR_CooperativeControlMessage_1[2];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "CCMPartIIcontent.h"

#endif	/* _CooperativeControlMessage_H_ */
#include "asn_internal.h"
