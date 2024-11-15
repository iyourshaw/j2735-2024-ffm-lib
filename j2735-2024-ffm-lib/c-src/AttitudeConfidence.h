/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "SensorDataSharingMessage"
 * 	found in "asn/J3224-SensorDataSharingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_AttitudeConfidence_H_
#define	_AttitudeConfidence_H_


#include "asn_application.h"

/* Including external dependencies */
#include "HeadingConfidence.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* AttitudeConfidence */
typedef struct AttitudeConfidence {
	HeadingConfidence_t	 pitchConfidence;
	HeadingConfidence_t	 rollConfidence;
	HeadingConfidence_t	 yawConfidence;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} AttitudeConfidence_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_AttitudeConfidence;
extern asn_SEQUENCE_specifics_t asn_SPC_AttitudeConfidence_specs_1;
extern asn_TYPE_member_t asn_MBR_AttitudeConfidence_1[3];

#ifdef __cplusplus
}
#endif

#endif	/* _AttitudeConfidence_H_ */
#include "asn_internal.h"
