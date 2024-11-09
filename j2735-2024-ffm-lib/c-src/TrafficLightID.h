/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TrafficLightStatusMessage"
 * 	found in "asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TrafficLightID_H_
#define	_TrafficLightID_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"
#include "OBJECT_IDENTIFIER.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TrafficLightID_PR {
	TrafficLightID_PR_NOTHING,	/* No components present */
	TrafficLightID_PR_id,
	TrafficLightID_PR_oid
} TrafficLightID_PR;

/* TrafficLightID */
typedef struct TrafficLightID {
	TrafficLightID_PR present;
	union TrafficLightID_u {
		long	 id;
		OBJECT_IDENTIFIER_t	 oid;
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} TrafficLightID_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_TrafficLightID;
extern asn_CHOICE_specifics_t asn_SPC_TrafficLightID_specs_1;
extern asn_TYPE_member_t asn_MBR_TrafficLightID_1[2];
extern asn_per_constraints_t asn_PER_type_TrafficLightID_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _TrafficLightID_H_ */
#include "asn_internal.h"