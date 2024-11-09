/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "Common"
 * 	found in "asn/J2735-Common-2024-rel-v1.1.2.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_TimeOffset_H_
#define	_TimeOffset_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* TimeOffset */
typedef long	 TimeOffset_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_TimeOffset_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_TimeOffset;
asn_struct_free_f TimeOffset_free;
asn_struct_print_f TimeOffset_print;
asn_constr_check_f TimeOffset_constraint;
ber_type_decoder_f TimeOffset_decode_ber;
der_type_encoder_f TimeOffset_encode_der;
xer_type_decoder_f TimeOffset_decode_xer;
xer_type_encoder_f TimeOffset_encode_xer;
jer_type_encoder_f TimeOffset_encode_jer;
oer_type_decoder_f TimeOffset_decode_oer;
oer_type_encoder_f TimeOffset_encode_oer;
per_type_decoder_f TimeOffset_decode_uper;
per_type_encoder_f TimeOffset_encode_uper;
per_type_decoder_f TimeOffset_decode_aper;
per_type_encoder_f TimeOffset_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _TimeOffset_H_ */
#include "asn_internal.h"