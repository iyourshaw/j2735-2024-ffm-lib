/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadUserChargingConfigMessage"
 * 	found in "asn/J3217-R-RoadUserChargingConfigMsg-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RoadUserChargingConfigMessage_H_
#define	_RoadUserChargingConfigMessage_H_


#include "asn_application.h"

/* Including external dependencies */
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct ChargerInfo;

/* RoadUserChargingConfigMessage */
typedef struct RoadUserChargingConfigMessage {
	struct RoadUserChargingConfigMessage__chargerInfoTable {
		A_SEQUENCE_OF(struct ChargerInfo) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} chargerInfoTable;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RoadUserChargingConfigMessage_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RoadUserChargingConfigMessage;
extern asn_SEQUENCE_specifics_t asn_SPC_RoadUserChargingConfigMessage_specs_1;
extern asn_TYPE_member_t asn_MBR_RoadUserChargingConfigMessage_1[1];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "ChargerInfo.h"

#endif	/* _RoadUserChargingConfigMessage_H_ */
#include "asn_internal.h"
