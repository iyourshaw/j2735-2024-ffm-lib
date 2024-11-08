/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataReport"
 * 	found in "asn/J2945-C-ProbeDataReport-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_RptRoadwayEvents_H_
#define	_RptRoadwayEvents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NULL.h"
#include "RptRoadRoughness.h"
#include "RptTrafficSigEncounters.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum RptRoadwayEvents_PR {
	RptRoadwayEvents_PR_NOTHING,	/* No components present */
	RptRoadwayEvents_PR_obstacleDetected,
	RptRoadwayEvents_PR_adverseRoadSurface,
	RptRoadwayEvents_PR_trfsigEncounters,
	RptRoadwayEvents_PR_trfsigLightOut,
	RptRoadwayEvents_PR_trfsigRoadGeoMismatch,
	RptRoadwayEvents_PR_roadsignDetection,
	RptRoadwayEvents_PR_lowRoadsignReflect,
	RptRoadwayEvents_PR_lowLaneMarkReflect,
	RptRoadwayEvents_PR_roadsignIncnstncy,
	RptRoadwayEvents_PR_laneGeoIncnstncy,
	RptRoadwayEvents_PR_incidentDetect,
	RptRoadwayEvents_PR_workZoneCharDetect,
	RptRoadwayEvents_PR_inclWeatherDetect,
	RptRoadwayEvents_PR_railrdCrossActiv,
	RptRoadwayEvents_PR_drawBridgeActiv
	/* Extensions may appear below */
	
} RptRoadwayEvents_PR;

/* RptRoadwayEvents */
typedef struct RptRoadwayEvents {
	RptRoadwayEvents_PR present;
	union RptRoadwayEvents_u {
		NULL_t	 obstacleDetected;
		RptRoadRoughness_t	 adverseRoadSurface;
		RptTrafficSigEncounters_t	 trfsigEncounters;
		NULL_t	 trfsigLightOut;
		NULL_t	 trfsigRoadGeoMismatch;
		NULL_t	 roadsignDetection;
		NULL_t	 lowRoadsignReflect;
		NULL_t	 lowLaneMarkReflect;
		NULL_t	 roadsignIncnstncy;
		NULL_t	 laneGeoIncnstncy;
		NULL_t	 incidentDetect;
		NULL_t	 workZoneCharDetect;
		NULL_t	 inclWeatherDetect;
		NULL_t	 railrdCrossActiv;
		NULL_t	 drawBridgeActiv;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} RptRoadwayEvents_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_RptRoadwayEvents;
extern asn_CHOICE_specifics_t asn_SPC_RptRoadwayEvents_specs_1;
extern asn_TYPE_member_t asn_MBR_RptRoadwayEvents_1[15];
extern asn_per_constraints_t asn_PER_type_RptRoadwayEvents_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _RptRoadwayEvents_H_ */
#include "asn_internal.h"
