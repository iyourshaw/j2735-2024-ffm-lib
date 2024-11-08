/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollUsageMessage"
 * 	found in "asn/J3217-TollUsageMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TumVehicleId_H_
#define	_TumVehicleId_H_


#include "asn_application.h"

/* Including external dependencies */
#include "OCTET_STRING.h"
#include "IA5String.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct UserId;

/* TumVehicleId */
typedef struct TumVehicleId {
	OCTET_STRING_t	*vehicleIdentity;	/* OPTIONAL */
	IA5String_t	*licPlateState;	/* OPTIONAL */
	IA5String_t	*licPlateNumVeh;	/* OPTIONAL */
	IA5String_t	*licPlateNumTrailer;	/* OPTIONAL */
	struct UserId	*userId;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} TumVehicleId_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_TumVehicleId;
extern asn_SEQUENCE_specifics_t asn_SPC_TumVehicleId_specs_1;
extern asn_TYPE_member_t asn_MBR_TumVehicleId_1[5];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "UserId.h"

#endif	/* _TumVehicleId_H_ */
#include "asn_internal.h"