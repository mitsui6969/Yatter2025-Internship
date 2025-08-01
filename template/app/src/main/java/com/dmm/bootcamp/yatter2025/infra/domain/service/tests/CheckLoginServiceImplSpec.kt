//package com.dmm.bootcamp.yatter2025.infra.domain.service.tests
//
//import com.dmm.bootcamp.yatter2025.infra.domain.service.CheckLoginServiceImpl
//import com.dmm.bootcamp.yatter2025.infra.pref.TokenPreferences
//import okhttp3.internal.tls.OkHostnameVerifier.verify
//import org.hamcrest.MatcherAssert.assertThat
//import org.junit.Test
//
//class CheckLoginServiceImplSpec {
//    private val tokenPreferences = mockk<TokenPreferences>()
//    private val subject = CheckLoginServiceImpl(tokenPreferences)
//
//    @Test
//    fun getTrueWhenSavedUsername() = runTest {
//        val accessToken = "accessToken"
//
//        coEvery {
//            tokenPreferences.getAccessToken()
//        } returns accessToken
//
//        val result: Boolean = subject.execute()
//
//        assertThat(result).isTrue()
//
//        verify {
//            tokenPreferences.getAccessToken()
//        }
//    }
//
//    @Test
//    fun getFalseWhenUnsavedUsername() = runTest {
//        val accessToken = ""
//
//        coEvery {
//            tokenPreferences.getAccessToken()
//        } returns accessToken
//
//        val result: Boolean = subject.execute()
//
//        assertThat(result).isFalse()
//
//        verify {
//            tokenPreferences.getAccessToken()
//        }
//    }
//}