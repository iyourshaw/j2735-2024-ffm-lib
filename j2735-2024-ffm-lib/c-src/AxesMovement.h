/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CooperativeControlMessage"
 * 	found in "asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AxesMovement_H_
#define	_AxesMovement_H_


#include "asn_application.h"

/* Including external dependencies */
#include "Yaw.h"
#include "Pitch.h"
#include "Roll.h"
#include "YawRate.h"
#include "CooperativeControlMessage_PitchRate.h"
#include "CooperativeControlMessage_RollRate.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* AxesMovement */
typedef struct AxesMovement {
	Yaw_t	*yaw;	/* OPTIONAL */
	Pitch_t	*pitch;	/* OPTIONAL */
	Roll_t	*roll;	/* OPTIONAL */
	YawRate_t	*yawRate;	/* OPTIONAL */
	CooperativeControlMessage_PitchRate_t	*pitchRate;	/* OPTIONAL */
	CooperativeControlMessage_RollRate_t	*rollRate;	/* OPTIONAL */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} AxesMovement_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_AxesMovement;
extern asn_SEQUENCE_specifics_t asn_SPC_AxesMovement_specs_1;
extern asn_TYPE_member_t asn_MBR_AxesMovement_1[6];

#ifdef __cplusplus
}
#endif

#endif	/* _AxesMovement_H_ */
#include "asn_internal.h"
