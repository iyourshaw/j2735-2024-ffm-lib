/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_UserId_H_
#define	_UserId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "PersonalAccountNumber.h"
#include "ContractSerialNumber.h"
#include "EquipmentIccId.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct Lpn;
struct ObeId;

/* UserId */
typedef struct UserId {
	PersonalAccountNumber_t	*pan;	/* OPTIONAL */
	ContractSerialNumber_t	*contractSerialNumber;	/* OPTIONAL */
	struct Lpn	*licencePlateNumber;	/* OPTIONAL */
	struct ObeId	*obeId;	/* OPTIONAL */
	EquipmentIccId_t	*iccId;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} UserId_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_UserId;
extern asn_SEQUENCE_specifics_t asn_SPC_UserId_specs_1;
extern asn_TYPE_member_t asn_MBR_UserId_1[5];
extern asn_per_constraints_t asn_PER_type_UserId_constr_1;

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "Lpn.h"
#include "ObeId.h"

#endif	/* _UserId_H_ */
#include "asn_internal.h"
