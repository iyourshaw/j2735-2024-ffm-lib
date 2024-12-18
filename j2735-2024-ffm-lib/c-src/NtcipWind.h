/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_NtcipWind_H_
#define	_NtcipWind_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NTCIPWindSensorAvgSpeed.h"
#include "NTCIPWindSensorAvgDirection.h"
#include "NTCIPWindSensorSpotSpeed.h"
#include "NTCIPWindSensorSpotDirection.h"
#include "NTCIPWindSensorGustSpeed.h"
#include "NTCIPWindSensorGustDirection.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* NtcipWind */
typedef struct NtcipWind {
	NTCIPWindSensorAvgSpeed_t	*avgSpeed;	/* OPTIONAL */
	NTCIPWindSensorAvgDirection_t	*avgDirection;	/* OPTIONAL */
	NTCIPWindSensorSpotSpeed_t	*currentSpeed;	/* OPTIONAL */
	NTCIPWindSensorSpotDirection_t	*curDirection;	/* OPTIONAL */
	NTCIPWindSensorGustSpeed_t	*gustSpeed;	/* OPTIONAL */
	NTCIPWindSensorGustDirection_t	*gustDirection;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NtcipWind_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NtcipWind;
extern asn_SEQUENCE_specifics_t asn_SPC_NtcipWind_specs_1;
extern asn_TYPE_member_t asn_MBR_NtcipWind_1[6];

#ifdef __cplusplus
}
#endif

#endif	/* _NtcipWind_H_ */
#include "asn_internal.h"
