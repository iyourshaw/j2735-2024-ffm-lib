/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EmergencyVehicleAlert"
 * 	found in "asn/J2735-EmergencyVehicleAlert-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_EmergencyVehicleAlert_H_
#define	_EmergencyVehicleAlert_H_


#include "asn_application.h"

/* Including external dependencies */
#include "MinuteOfTheYear.h"
#include "TemporaryID.h"
#include "RoadSideAlert.h"
#include "ResponseType.h"
#include "VehicleMass.h"
#include "VehicleType.h"
#include "ITIS_VehicleGroupAffected.h"
#include "ITIS_IncidentResponseEquipment.h"
#include "ITIS_ResponderGroupAffected.h"
#include "asn_SEQUENCE_OF.h"
#include "constr_SEQUENCE_OF.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct EmergencyDetails;
struct Reg_EmergencyVehicleAlert;

/* EmergencyVehicleAlert */
typedef struct EmergencyVehicleAlert {
	MinuteOfTheYear_t	*timeStamp;	/* OPTIONAL */
	TemporaryID_t	*id;	/* OPTIONAL */
	RoadSideAlert_t	 rsaMsg;
	ResponseType_t	*responseType;	/* OPTIONAL */
	struct EmergencyDetails	*details;	/* OPTIONAL */
	VehicleMass_t	*mass;	/* OPTIONAL */
	VehicleType_t	*basicType;	/* OPTIONAL */
	ITIS_VehicleGroupAffected_t	*vehicleType;	/* OPTIONAL */
	ITIS_IncidentResponseEquipment_t	*responseEquip;	/* OPTIONAL */
	ITIS_ResponderGroupAffected_t	*responderType;	/* OPTIONAL */
	struct EmergencyVehicleAlert__regional {
		A_SEQUENCE_OF(struct Reg_EmergencyVehicleAlert) list;
		
		/* Context for parsing across buffer boundaries */
		asn_struct_ctx_t _asn_ctx;
	} *regional;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} EmergencyVehicleAlert_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_EmergencyVehicleAlert;
extern asn_SEQUENCE_specifics_t asn_SPC_EmergencyVehicleAlert_specs_1;
extern asn_TYPE_member_t asn_MBR_EmergencyVehicleAlert_1[11];

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "EmergencyDetails.h"
#include "RegionalExtension.h"

#endif	/* _EmergencyVehicleAlert_H_ */
#include "asn_internal.h"
