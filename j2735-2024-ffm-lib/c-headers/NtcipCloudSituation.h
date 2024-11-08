/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_NtcipCloudSituation_H_
#define	_NtcipCloudSituation_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NTCIPEssCloudSituationV4.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* NtcipCloudSituation */
typedef struct NtcipCloudSituation {
	NTCIPEssCloudSituationV4_t	 situation;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} NtcipCloudSituation_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NtcipCloudSituation;
extern asn_SEQUENCE_specifics_t asn_SPC_NtcipCloudSituation_specs_1;
extern asn_TYPE_member_t asn_MBR_NtcipCloudSituation_1[1];

#ifdef __cplusplus
}
#endif

#endif	/* _NtcipCloudSituation_H_ */
#include "asn_internal.h"
