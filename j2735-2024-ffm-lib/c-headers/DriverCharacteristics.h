/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_DriverCharacteristics_H_
#define	_DriverCharacteristics_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Int1Unsigned.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* DriverCharacteristics */
typedef struct DriverCharacteristics {
	Int1Unsigned_t	 driverClass;
	Int1Unsigned_t	 tripPurpose;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} DriverCharacteristics_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_DriverCharacteristics;
extern asn_SEQUENCE_specifics_t asn_SPC_DriverCharacteristics_specs_1;
extern asn_TYPE_member_t asn_MBR_DriverCharacteristics_1[2];

#ifdef __cplusplus
}
#endif

#endif	/* _DriverCharacteristics_H_ */
#include "asn_internal.h"
