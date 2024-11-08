/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_VehicleReport_H_
#define	_VehicleReport_H_


#include "asn_application.h"

/* Including external dependencies */
#include "RwmSnapShot.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct WDMSFleetData;

/* VehicleReport */
typedef struct VehicleReport {
	RwmSnapShot_t	 snapShot;
	struct WDMSFleetData	*wdmsFleetData;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} VehicleReport_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_VehicleReport;
extern asn_SEQUENCE_specifics_t asn_SPC_VehicleReport_specs_1;
extern asn_TYPE_member_t asn_MBR_VehicleReport_1[2];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "WDMSFleetData.h"

#endif	/* _VehicleReport_H_ */
#include "asn_internal.h"
