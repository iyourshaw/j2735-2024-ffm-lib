/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CfgSummaryTriggers_H_
#define	_CfgSummaryTriggers_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct CfgLowSpeedCriteria;
struct CfgStoppedCriteria;
struct CfgMsgRecepIndicators;

/* CfgSummaryTriggers */
typedef struct CfgSummaryTriggers {
	BOOLEAN_t	*regTravelTime;	/* OPTIONAL */
	BOOLEAN_t	*regVehDistTraveled;	/* OPTIONAL */
	BOOLEAN_t	*regVehTimeTraveled;	/* OPTIONAL */
	BOOLEAN_t	*fuelConsumption;	/* OPTIONAL */
	BOOLEAN_t	*totalVehEmissions;	/* OPTIONAL */
	struct CfgLowSpeedCriteria	*numOfLowSpeedEvents;	/* OPTIONAL */
	struct CfgStoppedCriteria	*timeStopped;	/* OPTIONAL */
	struct CfgStoppedCriteria	*numOfStopped;	/* OPTIONAL */
	BOOLEAN_t	*locOfStops;	/* OPTIONAL */
	BOOLEAN_t	*regNumOfVehPassed;	/* OPTIONAL */
	BOOLEAN_t	*regNumOfSurpassedVeh;	/* OPTIONAL */
	struct CfgMsgRecepIndicators	*totalMsgsReceived;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CfgSummaryTriggers_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CfgSummaryTriggers;
extern asn_SEQUENCE_specifics_t asn_SPC_CfgSummaryTriggers_specs_1;
extern asn_TYPE_member_t asn_MBR_CfgSummaryTriggers_1[12];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "CfgLowSpeedCriteria.h"
#include "CfgStoppedCriteria.h"
#include "CfgMsgRecepIndicators.h"

#endif	/* _CfgSummaryTriggers_H_ */
#include "asn_internal.h"
