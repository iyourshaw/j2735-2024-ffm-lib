/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ManeuverSharingAndCoordinatingMessage"
 * 	found in "asn/J3186-ManeuverSharingandCoordinatingMessage-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ResponseFlag_H_
#define	_ResponseFlag_H_


#include "asn_application.h"

/* Including external dependencies */
#include "BOOLEAN.h"

#ifdef __cplusplus
extern "C" {
#endif

/* ResponseFlag */
typedef BOOLEAN_t	 ResponseFlag_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ResponseFlag;
asn_struct_free_f ResponseFlag_free;
asn_struct_print_f ResponseFlag_print;
asn_constr_check_f ResponseFlag_constraint;
ber_type_decoder_f ResponseFlag_decode_ber;
der_type_encoder_f ResponseFlag_encode_der;
xer_type_decoder_f ResponseFlag_decode_xer;
xer_type_encoder_f ResponseFlag_encode_xer;
jer_type_encoder_f ResponseFlag_encode_jer;
oer_type_decoder_f ResponseFlag_decode_oer;
oer_type_encoder_f ResponseFlag_encode_oer;
per_type_decoder_f ResponseFlag_decode_uper;
per_type_encoder_f ResponseFlag_encode_uper;
per_type_decoder_f ResponseFlag_decode_aper;
per_type_encoder_f ResponseFlag_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ResponseFlag_H_ */
#include "asn_internal.h"
