/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadUserChargingConfigMessage"
 * 	found in "asn/J3217-R-RoadUserChargingConfigMsg-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_PrimaryRegionState_H_
#define	_PrimaryRegionState_H_


#include "asn_application.h"

/* Including external dependencies */
#include "IA5String.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct ChargingFees;

/* PrimaryRegionState */
typedef struct PrimaryRegionState {
	IA5String_t	 usCanMexState;
	struct ChargingFees	*chargingFees;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} PrimaryRegionState_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_PrimaryRegionState;
extern asn_SEQUENCE_specifics_t asn_SPC_PrimaryRegionState_specs_1;
extern asn_TYPE_member_t asn_MBR_PrimaryRegionState_1[2];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "ChargingFees.h"

#endif	/* _PrimaryRegionState_H_ */
#include "asn_internal.h"
