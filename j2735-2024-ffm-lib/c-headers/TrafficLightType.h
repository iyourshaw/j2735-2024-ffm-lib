/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TrafficLightStatusMessage"
 * 	found in "asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TrafficLightType_H_
#define	_TrafficLightType_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum TrafficLightType {
	TrafficLightType_reserved	= 0,
	TrafficLightType_straight	= 1,
	TrafficLightType_left_turn	= 2,
	TrafficLightType_pedestrian	= 3,
	TrafficLightType_bicycle	= 4,
	TrafficLightType_right_turn	= 5,
	TrafficLightType_bus	= 6,
	TrafficLightType_u_turn	= 7
	/*
	 * Enumeration is extensible
	 */
} e_TrafficLightType;

/* TrafficLightType */
typedef long	 TrafficLightType_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TrafficLightType_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TrafficLightType;
extern const asn_INTEGER_specifics_t asn_SPC_TrafficLightType_specs_1;
asn_struct_free_f TrafficLightType_free;
asn_struct_print_f TrafficLightType_print;
asn_constr_check_f TrafficLightType_constraint;
ber_type_decoder_f TrafficLightType_decode_ber;
der_type_encoder_f TrafficLightType_encode_der;
xer_type_decoder_f TrafficLightType_decode_xer;
xer_type_encoder_f TrafficLightType_encode_xer;
jer_type_encoder_f TrafficLightType_encode_jer;
oer_type_decoder_f TrafficLightType_decode_oer;
oer_type_encoder_f TrafficLightType_encode_oer;
per_type_decoder_f TrafficLightType_decode_uper;
per_type_encoder_f TrafficLightType_encode_uper;
per_type_decoder_f TrafficLightType_decode_aper;
per_type_encoder_f TrafficLightType_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TrafficLightType_H_ */
#include "asn_internal.h"
