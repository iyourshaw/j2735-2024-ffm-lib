/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollUsageMessage"
 * 	found in "asn/J3217-TollUsageMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LocAndTimeStamp_H_
#define	_LocAndTimeStamp_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Common_Latitude.h"
#include "Common_Longitude.h"
#include "Common_Elevation.h"
#include "DDateTime.h"
#include "LaneID.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* LocAndTimeStamp */
typedef struct LocAndTimeStamp {
	Common_Latitude_t	 latitude;
	Common_Longitude_t	 longitude;
	Common_Elevation_t	*elevation;	/* OPTIONAL */
	DDateTime_t	 timeStamp;
	LaneID_t	*currentLane;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} LocAndTimeStamp_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_LocAndTimeStamp;
extern asn_SEQUENCE_specifics_t asn_SPC_LocAndTimeStamp_specs_1;
extern asn_TYPE_member_t asn_MBR_LocAndTimeStamp_1[5];

#ifdef __cplusplus
}
#endif

#endif	/* _LocAndTimeStamp_H_ */
#include "asn_internal.h"
