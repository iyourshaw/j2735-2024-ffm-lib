/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "CooperativeControlMessage"
 * 	found in "asn/J2945-6-CooperativeControlMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_HeavyTruckCCMExtensions_H_
#define	_HeavyTruckCCMExtensions_H_


#include "asn_application.h"

/* Including external dependencies */
#include "LongitudinalControlState.h"
#include "TemporaryID.h"
#include "RoadGrade.h"
#include "BrakePedalPosition.h"
#include "AcceleratorPedalPosition.h"
#include "Speed.h"
#include "Acceleration.h"
#include "Torque.h"
#include "SeparationDistance.h"
#include "TotalMass.h"
#include "MaxAvailableAcceleration.h"
#include "MaxAvailableDeceleration.h"
#include "CCMFaultMode.h"
#include "CooperativeControlMessage_ManeuverID.h"
#include "FrontCutIn.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct AxesMovement;

/* HeavyTruckCCMExtensions */
typedef struct HeavyTruckCCMExtensions {
	LongitudinalControlState_t	 longCntrlState;
	TemporaryID_t	*targetId;	/* OPTIONAL */
	RoadGrade_t	*roadGrade;	/* OPTIONAL */
	BrakePedalPosition_t	*brakePedalPos;	/* OPTIONAL */
	AcceleratorPedalPosition_t	*accelPedalPos;	/* OPTIONAL */
	Speed_t	*desiredSpeed;	/* OPTIONAL */
	Acceleration_t	*desiredAccel;	/* OPTIONAL */
	Torque_t	*desiredTorque;	/* OPTIONAL */
	Torque_t	*desiredTmRetarderTorque;	/* OPTIONAL */
	Torque_t	*desiredEngRetarderTorque;	/* OPTIONAL */
	struct AxesMovement	*axesMvmt;	/* OPTIONAL */
	SeparationDistance_t	*separationDist;	/* OPTIONAL */
	TotalMass_t	*totalMass;	/* OPTIONAL */
	MaxAvailableAcceleration_t	*maxAvailAccel;	/* OPTIONAL */
	MaxAvailableDeceleration_t	*maxAvailDecel;	/* OPTIONAL */
	CCMFaultMode_t	*ccmFaultMode;	/* OPTIONAL */
	CooperativeControlMessage_ManeuverID_t	*maneuverID;	/* OPTIONAL */
	FrontCutIn_t	*frontCutIn;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} HeavyTruckCCMExtensions_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_HeavyTruckCCMExtensions;
extern asn_SEQUENCE_specifics_t asn_SPC_HeavyTruckCCMExtensions_specs_1;
extern asn_TYPE_member_t asn_MBR_HeavyTruckCCMExtensions_1[18];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "AxesMovement.h"

#endif	/* _HeavyTruckCCMExtensions_H_ */
#include "asn_internal.h"
