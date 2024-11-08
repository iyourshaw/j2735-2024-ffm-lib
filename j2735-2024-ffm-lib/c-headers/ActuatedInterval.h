/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TrafficLightStatusMessage"
 * 	found in "asn/J2735-TrafficLightStatusMessage-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ActuatedInterval_H_
#define	_ActuatedInterval_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ActuatedInterval */
typedef BOOLEAN_t	 ActuatedInterval_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ActuatedInterval;
asn_struct_free_f ActuatedInterval_free;
asn_struct_print_f ActuatedInterval_print;
asn_constr_check_f ActuatedInterval_constraint;
ber_type_decoder_f ActuatedInterval_decode_ber;
der_type_encoder_f ActuatedInterval_encode_der;
xer_type_decoder_f ActuatedInterval_decode_xer;
xer_type_encoder_f ActuatedInterval_encode_xer;
jer_type_encoder_f ActuatedInterval_encode_jer;
oer_type_decoder_f ActuatedInterval_decode_oer;
oer_type_encoder_f ActuatedInterval_encode_oer;
per_type_decoder_f ActuatedInterval_decode_uper;
per_type_encoder_f ActuatedInterval_encode_uper;
per_type_decoder_f ActuatedInterval_decode_aper;
per_type_encoder_f ActuatedInterval_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ActuatedInterval_H_ */
#include "asn_internal.h"