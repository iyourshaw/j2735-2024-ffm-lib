/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_DetectedChargeObject_H_
#define	_DetectedChargeObject_H_


#include "asn_application.h"

/* Including external dependencies */
#include "ChargeObjectId.h"
#include "Int4Unsigned.h"
#include "GeneralizedTime.h"
#include "Int1Unsigned.h"
#include "DetectionMode.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Forward declarations */
struct Distance;
struct TariffClassDescription;
struct VehicleDescription;
struct PaymentFee;

/* DetectedChargeObject */
typedef struct DetectedChargeObject {
	ChargeObjectId_t	 chargeObjectId;
	Int4Unsigned_t	*subObjectNumber;	/* OPTIONAL */
	GeneralizedTime_t	*timeWhenUsed;	/* OPTIONAL */
	struct Distance	*mileageWhenUsed;	/* OPTIONAL */
	struct TariffClassDescription	*currentTariffClass;	/* OPTIONAL */
	struct VehicleDescription	*vehicleDescription;	/* OPTIONAL */
	Int1Unsigned_t	*obeStatus;	/* OPTIONAL */
	struct PaymentFee	*feeExclVat;	/* OPTIONAL */
	struct PaymentFee	*sumVat;	/* OPTIONAL */
	DetectionMode_t	*chargeObjDetectionMode;	/* OPTIONAL */
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} DetectedChargeObject_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_DetectedChargeObject;

#ifdef __cplusplus
}
#endif

/* Referred external types */
#include "Distance.h"
#include "TariffClassDescription.h"
#include "VehicleDescription.h"
#include "PaymentFee.h"

#endif	/* _DetectedChargeObject_H_ */
#include "asn_internal.h"
