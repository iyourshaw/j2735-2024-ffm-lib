/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_CopValue_H_
#define	_CopValue_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum CopValue {
	CopValue_noEntry	= 0,
	CopValue_co2class1	= 1,
	CopValue_co2class2	= 2,
	CopValue_co2class3	= 3,
	CopValue_co2class4	= 4,
	CopValue_co2class5	= 5,
	CopValue_co2class6	= 6,
	CopValue_co2class7	= 7
} e_CopValue;

/* CopValue */
typedef long	 CopValue_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_CopValue_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_CopValue;
asn_struct_free_f CopValue_free;
asn_struct_print_f CopValue_print;
asn_constr_check_f CopValue_constraint;
ber_type_decoder_f CopValue_decode_ber;
der_type_encoder_f CopValue_encode_der;
xer_type_decoder_f CopValue_decode_xer;
xer_type_encoder_f CopValue_encode_xer;
jer_type_encoder_f CopValue_encode_jer;
oer_type_decoder_f CopValue_decode_oer;
oer_type_encoder_f CopValue_encode_oer;
per_type_decoder_f CopValue_decode_uper;
per_type_encoder_f CopValue_encode_uper;
per_type_decoder_f CopValue_decode_aper;
per_type_encoder_f CopValue_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _CopValue_H_ */
#include "asn_internal.h"
