/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TrafficLightStatusMessage"
 * 	found in "asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TrafficLightStatusList_H_
#define	_TrafficLightStatusList_H_


#include "asn_application.h"

/* Including external dependencies */
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct TrafficLightStatus;

/* TrafficLightStatusList */
typedef struct TrafficLightStatusList {
	A_SEQUENCE_OF(struct TrafficLightStatus) list;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} TrafficLightStatusList_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_TrafficLightStatusList;
extern asn_SET_OF_specifics_t asn_SPC_TrafficLightStatusList_specs_1;
extern asn_TYPE_member_t asn_MBR_TrafficLightStatusList_1[1];
extern asn_per_constraints_t asn_PER_type_TrafficLightStatusList_constr_1;

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "TrafficLightStatus.h"

#endif	/* _TrafficLightStatusList_H_ */
#include "asn_internal.h"
