/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CooperativeControlMessage"
 * 	found in "asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LightVehicleCCMExtensions_H_
#define	_LightVehicleCCMExtensions_H_


#include "asn_application.h"

/* Including external dependencies */
#include "LongitudinalControlState.h"
#include "TemporaryID.h"
#include "Acceleration.h"
#include "SeparationDistance.h"
#include "FrontCutIn.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct AccelTimeConstant;

/* LightVehicleCCMExtensions */
typedef struct LightVehicleCCMExtensions {
	LongitudinalControlState_t	 longCntrlState;
	TemporaryID_t	*targetId;	/* OPTIONAL */
	Acceleration_t	*accelForecast;	/* OPTIONAL */
	struct AccelTimeConstant	*accelTimeConst;	/* OPTIONAL */
	SeparationDistance_t	*seperationDist;	/* OPTIONAL */
	FrontCutIn_t	*frontCutIn;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} LightVehicleCCMExtensions_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_LightVehicleCCMExtensions;
extern asn_SEQUENCE_specifics_t asn_SPC_LightVehicleCCMExtensions_specs_1;
extern asn_TYPE_member_t asn_MBR_LightVehicleCCMExtensions_1[6];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "AccelTimeConstant.h"

#endif	/* _LightVehicleCCMExtensions_H_ */
#include "asn_internal.h"