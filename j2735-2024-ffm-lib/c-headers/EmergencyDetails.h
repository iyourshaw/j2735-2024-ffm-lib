/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_EmergencyDetails_H_
#define	_EmergencyDetails_H_


#include "asn_application.h"

/* Including external dependencies */
#include "SSPindex.h"
#include "SirenInUse.h"
#include "LightbarInUse.h"
#include "MultiVehicleResponse.h"
#include "ResponseType.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct PrivilegedEvents;

/* EmergencyDetails */
typedef struct EmergencyDetails {
	SSPindex_t	 doNotUse;
	SirenInUse_t	 sirenUse;
	LightbarInUse_t	 lightsUse;
	MultiVehicleResponse_t	 multi;
	struct PrivilegedEvents	*events;	/* OPTIONAL */
	ResponseType_t	*responseType;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} EmergencyDetails_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_EmergencyDetails;
extern asn_SEQUENCE_specifics_t asn_SPC_EmergencyDetails_specs_1;
extern asn_TYPE_member_t asn_MBR_EmergencyDetails_1[6];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "PrivilegedEvents.h"

#endif	/* _EmergencyDetails_H_ */
#include "asn_internal.h"
