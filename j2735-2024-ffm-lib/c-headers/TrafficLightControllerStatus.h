/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TrafficLightStatusMessage"
 * 	found in "asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TrafficLightControllerStatus_H_
#define	_TrafficLightControllerStatus_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BIT_STRING.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TrafficLightControllerStatus {
	TrafficLightControllerStatus_conflict	= 0,
	TrafficLightControllerStatus_center_comm_error	= 1,
	TrafficLightControllerStatus_scu_comm_error	= 2,
	TrafficLightControllerStatus_reserved1	= 3,
	TrafficLightControllerStatus_reserved2	= 4,
	TrafficLightControllerStatus_reserved3	= 5,
	TrafficLightControllerStatus_reserved4	= 6,
	TrafficLightControllerStatus_reserved5	= 7
} e_TrafficLightControllerStatus;

/* TrafficLightControllerStatus */
typedef BIT_STRING_t	 TrafficLightControllerStatus_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TrafficLightControllerStatus_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TrafficLightControllerStatus;
asn_struct_free_f TrafficLightControllerStatus_free;
asn_struct_print_f TrafficLightControllerStatus_print;
asn_constr_check_f TrafficLightControllerStatus_constraint;
ber_type_decoder_f TrafficLightControllerStatus_decode_ber;
der_type_encoder_f TrafficLightControllerStatus_encode_der;
xer_type_decoder_f TrafficLightControllerStatus_decode_xer;
xer_type_encoder_f TrafficLightControllerStatus_encode_xer;
jer_type_encoder_f TrafficLightControllerStatus_encode_jer;
oer_type_decoder_f TrafficLightControllerStatus_decode_oer;
oer_type_encoder_f TrafficLightControllerStatus_encode_oer;
per_type_decoder_f TrafficLightControllerStatus_decode_uper;
per_type_encoder_f TrafficLightControllerStatus_encode_uper;
per_type_decoder_f TrafficLightControllerStatus_decode_aper;
per_type_encoder_f TrafficLightControllerStatus_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TrafficLightControllerStatus_H_ */
#include "asn_internal.h"
