/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ChargeObjectId_H_
#define	_ChargeObjectId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Int4Unsigned.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct Provider;

/* ChargeObjectId */
typedef struct ChargeObjectId {
	struct Provider	*chargeObjectOperator;	/* OPTIONAL */
	Int4Unsigned_t	 chargeObjectDesignation;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ChargeObjectId_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ChargeObjectId;
extern asn_SEQUENCE_specifics_t asn_SPC_ChargeObjectId_specs_1;
extern asn_TYPE_member_t asn_MBR_ChargeObjectId_1[2];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "Provider.h"

#endif	/* _ChargeObjectId_H_ */
#include "asn_internal.h"
