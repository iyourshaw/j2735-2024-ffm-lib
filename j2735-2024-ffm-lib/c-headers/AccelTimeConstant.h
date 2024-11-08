/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CooperativeControlMessage"
 * 	found in "asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AccelTimeConstant_H_
#define	_AccelTimeConstant_H_


#include "asn_application.h"

/* Including external dependencies */
#include "TimeConstant.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* AccelTimeConstant */
typedef struct AccelTimeConstant {
	TimeConstant_t	*accelTimeConst;	/* OPTIONAL */
	TimeConstant_t	*decelTimeConst;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} AccelTimeConstant_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_AccelTimeConstant;
extern asn_SEQUENCE_specifics_t asn_SPC_AccelTimeConstant_specs_1;
extern asn_TYPE_member_t asn_MBR_AccelTimeConstant_1[2];

#ifdef __cplusplus
}
#endif

#endif	/* _AccelTimeConstant_H_ */
#include "asn_internal.h"
