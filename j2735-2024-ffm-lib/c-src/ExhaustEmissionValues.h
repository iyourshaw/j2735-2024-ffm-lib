/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ExhaustEmissionValues_H_
#define	_ExhaustEmissionValues_H_


#include "asn_application.h"

/* Including external dependencies */
#include "EmissionUnit.h"
#include "NativeInteger.h"
#include "Int2Unsigned.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ExhaustEmissionValues */
typedef struct ExhaustEmissionValues {
	EmissionUnit_t	 unitType;
	long	 emissionCo;
	Int2Unsigned_t	 emissionHc;
	Int2Unsigned_t	 emissionNox;
	Int2Unsigned_t	 emissionHcNox;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ExhaustEmissionValues_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ExhaustEmissionValues;
extern asn_SEQUENCE_specifics_t asn_SPC_ExhaustEmissionValues_specs_1;
extern asn_TYPE_member_t asn_MBR_ExhaustEmissionValues_1[5];

#ifdef __cplusplus
}
#endif

#endif	/* _ExhaustEmissionValues_H_ */
#include "asn_internal.h"
