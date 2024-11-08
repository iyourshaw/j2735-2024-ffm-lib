/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_NtcipEssData_H_
#define	_NtcipEssData_H_


#include "asn_application.h"

/* Including external dependencies */
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct NtcipAirTemperature;
struct NtcipAtmosphericPressure;
struct NtcipWind;
struct NtcipRelativeHumidity;
struct NtcipDewPoint;
struct NtcipPavement;
struct NtcipVisibility;
struct NtcipVisibilitySituation;
struct NtcipCloudSituation;
struct NtcipPrecipitation;
struct NtcipSolarRadiation;

/* NtcipEssData */
typedef struct NtcipEssData {
	struct NtcipAirTemperature	*airTemp;	/* OPTIONAL */
	struct NtcipAtmosphericPressure	*atmosphere;	/* OPTIONAL */
	struct NtcipWind	*wind;	/* OPTIONAL */
	struct NtcipRelativeHumidity	*humidity;	/* OPTIONAL */
	struct NtcipDewPoint	*dewpoint;	/* OPTIONAL */
	struct NtcipPavement	*pavement;	/* OPTIONAL */
	struct NtcipVisibility	*visibility;	/* OPTIONAL */
	struct NtcipVisibilitySituation	*visSituation;	/* OPTIONAL */
	struct NtcipCloudSituation	*cloudSitiation;	/* OPTIONAL */
	struct NtcipPrecipitation	*precipitation;	/* OPTIONAL */
	struct NtcipSolarRadiation	*solarRadiation;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NtcipEssData_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NtcipEssData;
extern asn_SEQUENCE_specifics_t asn_SPC_NtcipEssData_specs_1;
extern asn_TYPE_member_t asn_MBR_NtcipEssData_1[11];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "NtcipAirTemperature.h"
#include "NtcipAtmosphericPressure.h"
#include "NtcipWind.h"
#include "NtcipRelativeHumidity.h"
#include "NtcipDewPoint.h"
#include "NtcipPavement.h"
#include "NtcipVisibility.h"
#include "NtcipVisibilitySituation.h"
#include "NtcipCloudSituation.h"
#include "NtcipPrecipitation.h"
#include "NtcipSolarRadiation.h"

#endif	/* _NtcipEssData_H_ */
#include "asn_internal.h"
