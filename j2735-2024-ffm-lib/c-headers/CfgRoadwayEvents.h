/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CfgRoadwayEvents_H_
#define	_CfgRoadwayEvents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"
#include "NativeInteger.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct CfgTrafficSigEncounters;
struct CfgRoadSignInfo;

/* CfgRoadwayEvents */
typedef struct CfgRoadwayEvents {
	BOOLEAN_t	 obstacleDetected;
	BOOLEAN_t	 adverseRoadSurface;
	struct CfgTrafficSigEncounters	*trafficSigEncounters;	/* OPTIONAL */
	BOOLEAN_t	 trfsigLightOut;
	BOOLEAN_t	 trfsigRoadGeoMismatch;
	struct CfgRoadSignInfo	*roadSignInfo;	/* OPTIONAL */
	long	*lowLaneMarkReflect;	/* OPTIONAL */
	BOOLEAN_t	 roadsignIncnstncy;
	BOOLEAN_t	 laneGeoIncnstncy;
	BOOLEAN_t	 incidentDetect;
	BOOLEAN_t	 workZoneCharDetect;
	BOOLEAN_t	 inclWeatherDetect;
	BOOLEAN_t	 railrdCrossActivated;
	BOOLEAN_t	 drawBridgeActivated;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} CfgRoadwayEvents_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_CfgRoadwayEvents;
extern asn_SEQUENCE_specifics_t asn_SPC_CfgRoadwayEvents_specs_1;
extern asn_TYPE_member_t asn_MBR_CfgRoadwayEvents_1[14];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "CfgTrafficSigEncounters.h"
#include "CfgRoadSignInfo.h"

#endif	/* _CfgRoadwayEvents_H_ */
#include "asn_internal.h"
